package com.example.jpetstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.domain.QA;
import com.example.jpetstore.service.PetStoreFacade;


@Controller
@SessionAttributes("userSession")
public class AuctionFormController {
	
	@Value("tiles/AuctionList")
	private String auctionList;
	private PetStoreFacade petStore;
	
	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	private Auction auction;
	
	@ModelAttribute("AucList")
	public List<Auction> getQAList(){
		List<Auction> aucList = new ArrayList<Auction>();
		return aucList;
	}
	
	@RequestMapping("/auction/auclist.do") //���� ��� 
	public String allAuction(@ModelAttribute("AucList") List<Auction> aucList) throws Exception {
		//aucStatus�� true �� �� �𵨿� put
		
		return auctionList;
		
	}
	
//	@Autowired
//	public void setAutcion(Auction auction) {
//		this.auction = auction;
//	}

	@RequestMapping("/auction/newAuction.do") //���� model �� ��� 
	public String nowAuction(
			@RequestParam("auction_Num") String auction_Num,
			ModelMap model) throws Exception {
		//aucStatus�� false �� �� �𵨿� put
		
		return "NowAuction";
		
		}
	
	@RequestMapping("/auction/pastAuction.do") //���� ��� 
	public String pastAuction(
			@RequestParam("auction_Num") String auction_Num,
			ModelMap model) throws Exception {
		//aucStatus�� true �� �� �𵨿� put
		
		return "PastAuction";
		
	}
	
	@RequestMapping("/auction/aucInputPrice.do") //���� �Է��ϱ� 
	public String inputPriceAuction(
			@RequestParam("auction_Num") String auction_Num,
			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		//aucparti�� price���� ����� id�� �ִ´�.
		
		return "AucPage";
		
		}
	
	@RequestMapping("/auction/aucOk.do") //�����ϱ� 
	public String okAuction(
			@RequestParam("auction_Num") String auction_Num,
			@ModelAttribute("maxPrice") String maxPrice,
			ModelMap model) throws Exception {
		//maxPrice�� ������ ã�� 
		
		return "AucPage";
		
		}				

	@RequestMapping("/auction/aucFail.do") //���� ���� 
	public String failAuction(
			@RequestParam("auction_Num") String auction_Num,
			@ModelAttribute("maxPrice") String maxPrice,
			ModelMap model) throws Exception {
		//service �� ������ 
		
		return "AuctionService";
		
		}	
	
}
