package com.example.jpetstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
public class ViewItemController { 

	private PetStoreFacade petStore;
	@Autowired
	private P2PService p2pService;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/shop/viewItem.do")
	public String handleRequest(
			@RequestParam("itemId") String itemId,
			ModelMap model) throws Exception {
		Item item = this.petStore.getItem(itemId);
		String userId = "anonymous";
		
		String[] ids = itemId.split("-");
		
		if (ids[0].equalsIgnoreCase("p2p")) {
			P2P p2p = this.p2pService.getP2PSeller(itemId);
			userId = p2p.getId();
			System.out.println("------------" + userId);
		}
		
		model.put("userId", userId);
		model.put("item", item);
		model.put("product", item.getProduct());
		return "tiles/Item";
	}
	
	@RequestMapping("/shop/deletePost.do")
	public String deletePost(HttpServletRequest request, @RequestParam("itemId") String itemId, ModelMap model) throws Exception {
		String old_url = request.getHeader("referer");
		System.out.println(" 글 삭제 ======> "+old_url);
		System.out.println(itemId + "삭제중...");
		this.petStore.deletePost(itemId);
		
		return "tiles/index";
	}
	
	@RequestMapping("/shop/updatePost.do")
	public String updatePost(HttpServletRequest request, @ModelAttribute("p2pForm") P2P p2pForm, ModelMap model) throws Exception {
//		String old_url = request.getHeader("referer");
//		System.out.println(" 글 삭제 ======> "+old_url);
//		System.out.println(itemId + "수정...");
//		this.petStore.updatePost(itemId);
//		
		return "tiles/index";
	}

}
