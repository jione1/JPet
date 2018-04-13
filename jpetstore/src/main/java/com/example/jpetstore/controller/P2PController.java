package com.example.jpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import com.example.jpetstore.service.PetStoreFacade;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;

@Controller
@SessionAttributes("userSession")
public class P2PController {
	
	private PetStoreFacade petStore;
	private Item item;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	private P2P p2p;
	
	public void setSellerId(P2P p2p) {
		this.p2p = p2p;
	}
	
	@RequestMapping("/p2p/writeP2PPost.do") //�Ǹű� �ۼ��Ϸ� ���� 
	public String writeP2PPost(
			@RequestParam("itemId") Item itemId,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		//�ۼ��� form �� submit
		
		return "P2PForm";
		
		}
	
	//����ϱ⸦ ������ �� ����� ���ε� 
	@RequestMapping("/p2p/sendP2PPost.do") //�Ǹű� �������� �����ֱ� 
	public String sendP2PPost(
			@RequestParam("itemId") Item itemId,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		//�ۼ��� form �� item �� �������� ���� 
		
		return "Item";
		
		}
	
	
}
