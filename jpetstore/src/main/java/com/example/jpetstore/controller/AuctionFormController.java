package com.example.jpetstore.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.jpetstore.dao.SequenceDao;
import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.domain.Cart;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.domain.Product;
import com.example.jpetstore.service.AuctionService;
import com.example.jpetstore.service.OrderService;
import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.PetStoreFacade;

@Controller
@SessionAttributes({"userSession", "sessionCart"})
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
	
	@ModelAttribute("sessionCart")
	public Cart createCart() {
		return new Cart();
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

	@RequestMapping("/auction/aucTemplist.do") //지난 경매 
	public String tempActionList(
			ModelMap model) throws Exception {
		//aucStatus가 true 인 것 모델에 put

		return "tiles/AuctionList";

	}
	
	@RequestMapping("/auction/aucInputPrice.do") //가격 입력하기 
	public String insertPrice(
			@RequestParam("auction_Num") int auction_num,
			@RequestParam("price") int inputPrice,
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		
		//aucparti에 price값과 사용자 id를 넣는다.
		String userID = userSession.getAccount().getUsername();
		
		Auction auction = auctionService.getAuctionDetail(auction_num);
		
		auction.setInputPrice(inputPrice);
		auction.setPartiId(userID);
		auction.setAuction_num(auction_num);

		auctionService.insertPrice(auction);
		
		return "redirect:" + "/auction/aucTemplist.do";
		
		}

	@RequestMapping("/auction/aucOk.do") //낙찰하기 
	public void okAuction(
			@RequestParam("auction_Num") int auction_Num,
			HttpSession session,
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		
		//maxPrice가 누군지 찾기 
		String userId = auctionService.findAucUserID(auction_Num);
		
		//해당 옥션 가져오기 
		Auction auction = auctionService.getAuctionDetail(auction_Num);
		
		if (userId == userSession.getAccount().getUsername()) {
		//cart에 넣기 - session에 넣으면 알아서?
			Cart cart = createCart();
			handleRequest(auction.getItemId(), cart);
		}
	}	

	public ModelAndView handleRequest(
			@RequestParam("workingItemId") String workingItemId,
			@ModelAttribute("sessionCart") Cart cart 
			) throws Exception {
		if (cart.containsItemId(workingItemId)) {
			cart.incrementQuantityByItemId(workingItemId);
		}
		else {
			boolean isInStock = this.petStore.isItemInStock(workingItemId);
			Item item = this.petStore.getItem(workingItemId);
			cart.addItem(item, isInStock);
		}
		return new ModelAndView("Cart", "cart", cart);
	}
	
	@RequestMapping("/auction/aucFail.do") //낙찰 포기 
	public void failAuction(
			@RequestParam("auction_Num") int auction_Num,
			HttpSession session,
			@ModelAttribute("userSession") UserSession userSession) throws Exception { 
		
		//가장 큰 값 행 지우기
		auctionService.deleteMaxPrice(auction_Num);
		
		// 그 다음 큰 값에 똑같이 진행 
		okAuction(auction_Num, session, userSession);
	
	}	

	@RequestMapping("/auction/viewAuctionDetail.do") //옥션 상세보기
		public String hadleRequset (
				@RequestParam("auction_Num") int auction_Num,
				ModelMap model, @ModelAttribute("userSession") UserSession userSession) throws Exception {
			
			Auction auction = auctionService.getAuctionDetail(auction_Num);
			
			System.out.println("옥션" + auction.getAuctionCost());
			
			model.put("auction", auction);

			return "tiles/AuctionDetail";
	}

	@RequestMapping("/auction/sendAuctionPost.do")
	public String sendAuctionPost(HttpServletRequest request, @ModelAttribute("auctionForm") AuctionForm auctionForm, Model model, @ModelAttribute("userSession") UserSession userSession) throws ParseException {
		String username = userSession.getAccount().getUsername();

		int auc_item_seq = sequenceDao.getNextId("auction_num");
		
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
//
//		auctionService.insertAucItem(auction.getUserId(), auction.getItemName(), "0", auction.getMaxPrice(), auction.getAuction_num(), auction.getEndtime());
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

		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getAuctionList();

		System.out.println("auctionlist" + auctionList.size());

		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());

		return "tiles/AuctionList";

	}
}