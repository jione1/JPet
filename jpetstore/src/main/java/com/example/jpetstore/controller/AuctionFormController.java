package com.example.jpetstore.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.jpetstore.dao.SequenceDao;
import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.domain.Product;
import com.example.jpetstore.service.AuctionService;
import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.PetStoreFacade;


@Controller
@SessionAttributes("userSession")
public class AuctionFormController {

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	private Item item;

	@Autowired
	private AuctionService auctionService;

	@Autowired
	private SequenceDao sequenceDao;

	private Auction auction;

	@Autowired
	private P2PService p2pService;

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

	@RequestMapping("/auction/aucTemplist.do") //현 경매 
	public String tempActionList(
			ModelMap model) throws Exception {
		//aucStatus가 true 인 것 모델에 put
		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getAuctionList();

		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());
		
		return "tiles/AuctionList";

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
	@RequestMapping("/auction/sendAuctionPost.do")
	public String sendAuctionPost(HttpServletRequest request, @ModelAttribute("auctionForm") AuctionForm auctionForm, Model model, @ModelAttribute("userSession") UserSession userSession) throws ParseException {
		String username = userSession.getAccount().getUsername();

		int auc_item_seq = sequenceDao.getNextId("auction_num");
		
		String id = "AUC-" + auc_item_seq;
		String pro_id = "AUC-PRO-" + auc_item_seq;
		
		Product pro = new Product();

		pro.setProductId(pro_id);
		pro.setCategoryId("AUCTIONS");
		pro.setName(auctionForm.getItemName());
		pro.setDescription(auctionForm.getAucDiscription());

		petStore.insertProduct(pro);	

		Item item = new Item();
		item.setItemId(id);
		item.setProductId(pro_id);
		item.setListPrice(auctionForm.getPrice());
		item.setUnitCost(auctionForm.getPrice());
		item.setStatus("P");
		//		item.setAttribute1(file);
		item.setQuantity(1);

		petStore.insertItem(item);
		
		auction = new Auction();

		auction.setItemId(id);
		
		auction.setAucEnd(request.getParameter("aucEnd"));
		auction.setMaxPrice(auctionForm.getPrice());
		auction.setAucStatus("0");
		auction.setAucName(auctionForm.getTitle());
		auction.setPrice(auctionForm.getPrice());
		auction.setUserId(username);
		auction.setAuction_num(auc_item_seq);
		auction.setItemName(auctionForm.getItemName());
		auction.setUserId(username);
		
		auctionService.insertAucItem(auction);

		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getAuctionList();

		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());

		return "tiles/AuctionList";

	}
}