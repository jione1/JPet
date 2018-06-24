package com.example.jpetstore.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
public class ViewItemController { 

	private PetStoreFacade petStore;
	@Autowired
	private P2PService p2pService;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	
	@RequestMapping("/shop/viewItem.do")
	public String handleRequest(
			@RequestParam("itemId") String itemId,
			ModelMap model) throws Exception {
		Item item = this.petStore.getItem(itemId);
		String userId = "anonymous";
		
		String[] ids = itemId.split("-");
		
		if (ids[0].equalsIgnoreCase("p2p")) {
			P2P p2p = this.p2pService.getP2PSeller(itemId);
			userId = p2p.getId();
			System.out.println("------------" + userId);
		}
		
		model.put("userId", userId);
		model.put("item", item);
		model.put("product", item.getProduct());
		return "tiles/Item";
	}
	
	@RequestMapping("/shop/deletePost.do")
	public String deletePost(HttpServletRequest request, @RequestParam("item") String itemId, ModelMap model) throws Exception {
//		String old_url = request.getHeader("referer");
//		System.out.println(" 글 삭제 ======> "+old_url);
		System.out.println(itemId + "삭제중...");
		this.petStore.deletePost(itemId);
		String category = request.getParameter("category");
		return "redirect:" + "/shop/viewCategory.do?categoryId=" + category;
	}
	
	@RequestMapping(value = "/shop/updatePost.do", method = RequestMethod.POST)
	public String updatePost(@ModelAttribute("item") Item item, Model model) throws Exception {
		P2P p2p = p2pService.getP2PDetail(item.getItemId());
		
		return "tiles/P2pForm_update";
	}
	@RequestMapping(value = "/shop/updatePost.do", method = RequestMethod.GET)
	public String updateGET(@RequestParam("item") String itemId, Model model) throws Exception {
		P2P p2p = p2pService.getP2PDetail(itemId);
		P2PForm p2pForm = new P2PForm();
		p2pForm.setItemId(itemId);
		p2pForm.setTitle(p2p.getTitle());
		p2pForm.setItemName(p2p.getProduct().getName());
		p2pForm.setQuantity(p2p.getItem().getQuantity());
		p2pForm.setPrice((int)p2p.getPrice());
		p2pForm.setDiscription(p2p.getProduct().getDescription());
		p2pForm.setCategory(p2p.getProduct().getCategoryId());
		
		
		List<String> categoryList = new ArrayList<>();
		categoryList.add("FISH");
		categoryList.add("DOGS");
		categoryList.add("CATS");
		categoryList.add("REPTILES");
		categoryList.add("BIRDS");
		if (p2pForm.getCategory().equals( "FISH") ) {
			Collections.swap(categoryList, 0, 0); 
		}
		else if(p2pForm.getCategory().equals("DOGS")) {
			Collections.swap(categoryList, 1, 0);
		}
		else if(p2pForm.getCategory().equals( "CATS")) {
			Collections.swap(categoryList, 2, 0);
		}
		else if(p2pForm.getCategory().equals( "REPTILES")) {
			Collections.swap(categoryList, 3, 0);
		}
		else{
			Collections.swap(categoryList, 4, 0);
		}
		
		model.addAttribute("categories", categoryList);
		model.addAttribute("P2PForm", p2pForm);
		model.addAttribute("itemId", itemId);
		return "tiles/P2pForm_update";
	}

}
