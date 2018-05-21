package com.example.jpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.P2PServiceImpl;
import com.example.jpetstore.service.PetStoreFacade;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;

@Controller
@SessionAttributes("userSession")
public class P2PController {
	
	private PetStoreFacade petStore;
	private Item item;
	
//	@Autowired
//	P2PServiceImpl p2pService;

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
		return "P2pForm";
		
		}
	
	//����ϱ⸦ ������ �� ����� ���ε� 
	@RequestMapping("/p2p/sendP2PPost.do") //�Ǹű� �������� �����ֱ� 
	public String sendP2PPost(
			@RequestParam("itemId") Item itemId,
			@ModelAttribute("userSession") UserSession userSession,
			@ModelAttribute("P2PForm") P2PForm p2pForm,
			ModelMap model) throws Exception {
		//�ۼ��� form �� item �� �������� ���� 
//		P2P p2p = new P2P();
//		
//		p2pService.insertP2P(p2p);
		return "Item";
//		
		}

}
