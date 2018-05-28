package com.example.jpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.P2PServiceImpl;
import com.example.jpetstore.service.PetStoreFacade;
import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.domain.Product;

@Controller
@SessionAttributes("userSession")
public class P2PController {
	
	@Autowired
	private PetStoreFacade petStore;
	private Item item;
	
	
	@Autowired
	P2PServiceImpl p2pService;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	@ModelAttribute("categories")
	public List<String> selectCategory() {
		List<String> categoryList = new ArrayList<>();
		categoryList.add("FISH");
		categoryList.add("DOG");
		categoryList.add("CAT");
		categoryList.add("REPTILES");
		categoryList.add("BIRD");
		return categoryList;
	}
	
	@RequestMapping("/p2p/writeP2PPost.do") //�Ǹű� �ۼ��Ϸ� ���� 
	public String writeP2PPost(@ModelAttribute("p2pForm") P2PForm p2pForm) throws Exception {
		//�ۼ��� form �� submit
		return "tiles/P2pForm";
		
		}
	
	//����ϱ⸦ ������ �� ����� ���ε� 
	@RequestMapping("/p2p/sendP2PPost.do") //�Ǹű� �������� �����ֱ� 
	public String sendP2PPost(
			HttpServletRequest request,
			@ModelAttribute("P2PForm") P2PForm p2pForm,
			ModelMap model,
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		//�ۼ��� form �� item �� �������� ���� 
		
//		MultipartFile file = p2pForm.getFile();
		String username = userSession.getAccount().getUsername();
		System.out.println(username);
		
		P2P p2p = new P2P();
		p2p.setItemId("P2P-02");
		p2p.setPrice(p2pForm.getPrice());
		p2p.setTitle(p2pForm.getTitle());
		p2p.setId(username);
		
		Item item = new Item();
		item.setItemId(p2p.getItemId());
		item.setProductId("P2-02");
		item.setListPrice(p2p.getPrice());
		item.setUnitCost(p2p.getPrice());
		item.setStatus("P");
//		item.setAttribute2(file);
		item.setQuantity(p2pForm.getQuantity());
		
		Product pro = new Product();
		
		pro.setProductId(item.getProductId());
		pro.setCategoryId("FISH");
		
		pro.setName(p2pForm.getItemName());
		pro.setDescription(p2pForm.getDiscription());
				
		petStore.insertProduct(pro);	
		
		petStore.insertItem(item);
		
		petStore.insertInventoryQuantity(item);

		p2pService.insertP2P(p2p);
		return "Item";
//		
		}

}
