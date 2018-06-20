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
<<<<<<< HEAD
		
	}
	
=======

	}

>>>>>>> origin/shinee
	@RequestMapping("/auction/auclist.do") //지난 경매 
	public String pastAuction(
			@RequestParam("auction_Num") String auction_Num,
			ModelMap model) throws Exception {
		//aucStatus가 true 인 것 모델에 put

		return "PastAuction";

	}

	@RequestMapping("/auction/aucTemplist.do") //지난 경매 
	public String tempActionList(
			ModelMap model) throws Exception {
		//aucStatus가 true 인 것 모델에 put

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
<<<<<<< HEAD
		System.out.println(username);
		
		int item_seq = 280;
		int product_seq = item_seq;
		
		System.out.println(item_seq + " " + product_seq);
		
		String id = "P2P-" + (item_seq);
		String pro_id;
		
		if (auctionForm.getCategory().equals("FISH")) {
			pro_id = "P2P-FI-" + (product_seq);
		} else if (auctionForm.getCategory().equals("DOGS")) {
			pro_id = "P2P-DO-" + (product_seq);
		}else if (auctionForm.getCategory().equals("CATS")) {
			pro_id = "P2P-CA-" + (product_seq);
		}else if (auctionForm.getCategory().equals("REPTILES")) {
			pro_id = "P2P-RE-" + (product_seq);
		}else {
			pro_id = "P2P-BI-" + (product_seq);
		}
		System.out.println(pro_id);
=======

//		ArrayList<P2P> p2pList = new ArrayList<P2P>(this.p2pService.getP2PList());
//		int item_seq = p2pList.size();
//
//		int size = auctionService.auctionListSize();
//
//
//		String id = "AUC-" + (item_seq + size + 1);
//		String pro_id = "AUC-PRO-" + (item_seq + size + 1);

		int auc_item_seq = sequenceDao.getNextId("auction_num");
>>>>>>> origin/shinee
		
		String id = "AUC-" + auc_item_seq;
		String pro_id = "AUC-PRO-" + auc_item_seq;
		
		auction = new Auction();

		auction.setItemId(id);
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date endTime = transFormat.parse(request.getParameter("endDate"));

		auction.setEndtime(endTime);
		auction.setMaxPrice(auctionForm.getPrice());
		auction.setAucStatus(false);
		auction.setAucName(auctionForm.getTitle());
		auction.setPrice(auctionForm.getPrice());
		auction.setUserId(username);
		auction.setAuction_num(auc_item_seq);
		auction.setItemName(auctionForm.getItemName());
		auction.setUserId(username);

		auctionService.insertAucItem(auction);


		Product pro = new Product();

		pro.setProductId(pro_id);
		pro.setCategoryId("FISH");
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

<<<<<<< HEAD
		auction.setEndtime(endTime);
		auction.setMaxPrice((int)item.getListPrice());
		auction.setAucStatus(false);
		auction.setAucName(auctionForm.getTitle());
		auction.setAuctionCost((int)item.getListPrice());
		auction.setUserId(username);
		auction.setAuction_num(3);
		auction.setItemName(auctionForm.getItemName());
		auction.setUserId(username);
		auctionService.insertAucItem(auction);
		
		return "tiles/AuctionItem";
=======
		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getAuctionList();

		System.out.println("auctionlist" + auctionList.size());

		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());

		return "tiles/AuctionList";
>>>>>>> origin/shinee
	}
}