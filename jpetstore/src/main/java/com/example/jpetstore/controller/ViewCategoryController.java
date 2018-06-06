package com.example.jpetstore.controller;

import org.springframework.beans.support.PagedListHolder;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.jpetstore.domain.Category;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.domain.Product;
import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
@SessionAttributes({"category", "productList", "userSession"})
public class ViewCategoryController { 
	private PetStoreFacade petStore;
	
	@Autowired
	private P2PService p2pService;
	
	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	
	@RequestMapping("/shop/viewCategory.do")
	public String handleRequest(
			@RequestParam("categoryId") String categoryId,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model
			) throws Exception {
		//보여줘야하는 정보 (p2ptitle, image, price)
		Category category = this.petStore.getCategory(categoryId);

		ArrayList<Product> productList = new ArrayList<Product>(this.petStore.getProductListByCategory(categoryId));

		ArrayList<Item> itemList = new ArrayList<>(); 
		
		for (int i = 0; i < productList.size(); i++) {
			itemList.addAll((ArrayList<Item>) petStore.getItemListByProduct(productList.get(i).getProductId()));
		}
		
//		System.out.println("---------------");
//		for (int i = 0; i < itemList.size(); i++) {
//			System.out.println(itemList.get(i).getItemId());
//		}
		
		String username = userSession.getAccount().getUsername();
		
		ArrayList<P2P> p2pList = new ArrayList<P2P>(this.p2pService.getP2PList());
		for (int i = 0; i < itemList.size(); i++) {
			for (int j = 0; j < p2pList.size(); j++) {
				if (itemList.get(i).getItemId().equals(p2pList.get(j).getItemId())) {
					itemList.get(i).setTitle(p2pList.get(j).getTitle());
					break;
				}
				itemList.get(i).setTitle(itemList.get(i).getItemId());
			}
			
		}
//		System.out.println("---------------");
//		for (int i = 0; i < itemList.size(); i++) {
//			System.out.println(itemList.get(i).getTitle());
//		}
		
//		PagedListHolder<Item> itemList = new PagedListHolder<Item>(this.petStore.getItemListByProduct(productId));
//		itemList.setPageSize(4);
		
		model.put("category", category);
		model.put("itemList", itemList);
//		model.put("p2pList", p2pList);
		model.put("listnum", itemList.size());
		return "tiles/product";
	}

	@RequestMapping("/shop/viewCategory2.do")
	public String handleRequest2(
			@RequestParam("page") String page,
			@ModelAttribute("category") Category category,
			@ModelAttribute("productList") PagedListHolder<Product> productList,
			BindingResult result) throws Exception {
		if (category == null || productList == null) {
			throw new IllegalStateException("Cannot find pre-loaded category and product list");
		}
		if ("next".equals(page)) { productList.nextPage(); }
		else if ("previous".equals(page)) { productList.previousPage(); }
		return "tiles/Category";
	}
}
