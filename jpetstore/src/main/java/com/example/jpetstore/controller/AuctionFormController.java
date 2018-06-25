package com.example.jpetstore.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.multipart.MultipartFile;


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
			ModelMap model) throws Exception {
		//aucStatus가 1 인 것 
		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getLastAuctionList();
		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());
		return "tiles/AuctionList";

	}

	@RequestMapping("/auction/aucTemplist.do") //현 경매 
	public String tempActionList(
			ModelMap model) throws Exception {
		//aucStatus가 true 인 것 모델에 put
		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getCurAuctionList();

		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());
		
		return "tiles/AuctionList";

	}
	

	@RequestMapping("/auction/aucCurlist.do") //현 경매 
	public String ActionCurList(
			ModelMap model) throws Exception {
		//aucStatus가 0 인 것 
		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getCurAuctionList();
		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());
		return "tiles/AuctionList";

	}
	
	@RequestMapping("/auction/aucDetail.do") //경매 아이템 상세 보기 
	public String ShowAuctionDetail(@ModelAttribute("auctionForm") AuctionForm auctionForm, @RequestParam("auction_Num") int auction_Num,
			ModelMap model) throws Exception {

		Auction auction = auctionService.getAuctionDetail(auction_Num);

		model.addAttribute("item", auction);
		return "tiles/AuctionParti";

	}
	
	@RequestMapping("/auction/sendAuctionPost.do")
	public String sendAuctionPost(HttpServletRequest request, @ModelAttribute("auctionForm") AuctionForm auctionForm, Model model, @ModelAttribute("userSession") UserSession userSession) throws ParseException {
		String username = userSession.getAccount().getUsername();


		MultipartFile report = auctionForm.getReport();

		String path = request.getSession().getServletContext().getRealPath("/images/");

		try {

			File file= new File(path, report.getOriginalFilename()); 
//			FileCopyUtils.copy(report.getBytes(), file);
			report.transferTo(file);
			System.out.println(file);
			
		} 
		catch (Exception e) {
			e.getStackTrace();
		}
		

		int item_seq = sequenceDao.getNextId("itemnum");
		int prd_seq = sequenceDao.getNextId("productnum");
		int auc_item_seq= sequenceDao.getNextId("auction_num");
		String id = "AUC-" + item_seq;
		String pro_id = "AUC-PRO-" + prd_seq;
		
		System.out.println("itemId = " + id + " prod_id = " + pro_id );

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
		auction.setDiscription(auctionForm.getDiscription());
		auctionService.insertAucItem(auction);


		Product pro = new Product();

		pro.setProductId(pro_id);
		pro.setCategoryId("AUCTIONS");
		pro.setName(auctionForm.getItemName());

		pro.setDescription(report.getOriginalFilename());


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
		
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date endTime = transFormat.parse(request.getParameter("aucEnd") + " 01:00");
		petStore.testScheduler(endTime, auc_item_seq);
		

		ArrayList<Auction> auctionList = (ArrayList<Auction>) this.auctionService.getCurAuctionList();

		model.addAttribute("itemList", auctionList);
		model.addAttribute("listnum", auctionList.size());

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
		
		return "redirect:" + "/auction/viewAuctionDetail.do?auction_Num= "+ auction_num;
	}

	@RequestMapping("/auction/aucOk.do") //낙찰하기 
	public String okAuction(@RequestParam("auction_Num") int auction_num, Model model) throws Exception {
		
		System.out.println("hereherehere" + auction_num);
		
		model.addAttribute("maxUser", auctionService.findAucUserID(auction_num));
		//maxPrice가 누군지 찾기 
//		userId = auctionService.findAucUserID(auction_num);
//		System.out.println(userId);
		
		return "redirect:/auction/viewAuctionDetail.do?auction_Num=" + auction_num;
		//해당 옥션 가져오기 
//		Auction auction = auctionService.getAuctionDetail(auction_num);
//		
//		if (userId == userSession.getAccount().getUsername()) {
//		//cart에 넣기 - session에 넣으면 알아서?
//			Cart cart = createCart();
//			handleRequest(auction.getItemId(), cart);
//		}
	}
	
//	public ModelAndView handleRequest(
//			@RequestParam("workingItemId") String workingItemId,
//			@ModelAttribute("sessionCart") Cart cart 
//			) throws Exception {
//		
//		System.out.println("여기여기");
//		if (cart.containsItemId(workingItemId)) {
//			cart.incrementQuantityByItemId(workingItemId);
//		}
//		else {
//			boolean isInStock = this.petStore.isItemInStock(workingItemId);
//			Item item = this.petStore.getItem(workingItemId);
//			cart.addItem(item, isInStock);
//		}
//		return new ModelAndView("Cart", "cart", cart);
//	}

	@RequestMapping("/auction/aucFail.do") //낙찰 포기 
	public void failAuction(
			@RequestParam("auction_Num") int auction_Num,
			HttpSession session,
			@ModelAttribute("userSession") UserSession userSession) throws Exception { 
		
		//가장 큰 값 행 지우기
		auctionService.deleteMaxPrice(auction_Num);
		
		// 그 다음 큰 값에 똑같이 진행 

		failAuction(auction_Num, session, userSession);
	
	}	


	@RequestMapping("/auction/viewAuctionDetail.do") //옥션 상세보기
	public String hadleRequset (
			@RequestParam("auction_Num") int auction_Num,
			ModelMap model, @ModelAttribute("userSession") UserSession userSession, @ModelAttribute("maxUser") String maxUser) throws Exception {
		
		Auction auction = auctionService.getAuctionDetail(auction_Num);
		
		int inputNum = auctionService.countInput(auction_Num);
		int maxPrice = 0;
		if(inputNum != 0)  
			maxPrice = auctionService.findMaxPrice(auction_Num);
		else
			maxPrice = auction.getAuctionCost();
		
		System.out.println("최고가격 : " + maxPrice);
		
		auction.setMaxPrice(maxPrice);

		model.put("auction", auction);
		if(maxUser != null)
			model.put("maxUser", maxUser);

		return "tiles/AuctionDetail";

	}
	
	
}