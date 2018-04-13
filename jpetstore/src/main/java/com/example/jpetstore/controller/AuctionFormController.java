package com.example.jpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.service.PetStoreFacade;


@Controller
@SessionAttributes("userSession")
public class AuctionFormController {
	
	private PetStoreFacade petStore;
	
	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	private Auction auction;
	
	@Autowired
	public void setAutcion(Auction auction) {
		this.auction = auction;
	}

	@RequestMapping("/auction/newAuction.do") //옥션 model 에 담기 
	public String nowAuction(
			@RequestParam("auction_Num") String auction_Num,
			ModelMap model) throws Exception {
		//aucStatus가 false 인 것 모델에 put
		
		return "NowAuction";
		
		}
	
	@RequestMapping("/auction/auclist.do") //지난 경매 
	public String pastAuction(
			@RequestParam("auction_Num") String auction_Num,
			ModelMap model) throws Exception {
		//aucStatus가 true 인 것 모델에 put
		
		return "PastAuction";
		
		}
	
	@RequestMapping("/auction/aucInputPrice.do") //가격 입력하기 
	public String inputPriceAuction(
			@RequestParam("auction_Num") String auction_Num,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		//aucparti에 price값과 사용자 id를 넣는다.
		
		return "AucPage";
		
		}
	
	@RequestMapping("/auction/aucOk.do") //낙찰하기 
	public String okAuction(
			@RequestParam("auction_Num") String auction_Num,
			@ModelAttribute("maxPrice") String maxPrice,
			ModelMap model) throws Exception {
		//maxPrice가 누군지 찾기 
		
		return "AucPage";
		
		}				

	@RequestMapping("/auction/aucFail.do") //낙찰 포기 
	public String failAuction(
			@RequestParam("auction_Num") String auction_Num,
			@ModelAttribute("maxPrice") String maxPrice,
			ModelMap model) throws Exception {
		//service 로 보내기 
		
		return "AuctionService";
		
		}	
	
}
