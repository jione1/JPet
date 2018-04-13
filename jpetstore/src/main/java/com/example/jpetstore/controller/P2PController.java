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
	
	@RequestMapping("/p2p/writeP2PPost.do") //판매글 작성하러 가기 
	public String writeP2PPost(
			@RequestParam("itemId") Item itemId,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		//작성한 form 을 submit
		
		return "P2PForm";
		
		}
	
	//등록하기를 눌렀을 때 여기로 매핑됨 
	@RequestMapping("/p2p/sendP2PPost.do") //판매글 상세페이지 보여주기 
	public String sendP2PPost(
			@RequestParam("itemId") Item itemId,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		//작성한 form 을 item 상세 페이지로 전달 
		
		return "Item";
		
		}
	
	
}
