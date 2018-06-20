package com.example.jpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.example.jpetstore.service.AccountFormValidator;
import com.example.jpetstore.service.P2PFormValidator;
import com.example.jpetstore.service.P2PService;
import com.example.jpetstore.service.P2PServiceImpl;
import com.example.jpetstore.service.PetStoreFacade;
import com.example.jpetstore.dao.SequenceDao;
import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.domain.Product;
import com.example.jpetstore.domain.Sequence;

@Controller
@SessionAttributes("userSession")
public class P2PController {
	
	@Autowired
	private PetStoreFacade petStore;
	private Item item;
	
	@Autowired
	private SequenceDao sequenceDao;
	
	@Autowired
	private P2PServiceImpl p2pService;
	
	@Autowired
	private P2PFormValidator p2pFormvalidator;
	public void setValidator(P2PFormValidator validator) {
		this.p2pFormvalidator = validator;
	}
	
	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}
	
	@ModelAttribute("categories")
	public List<String> selectCategory() {
		List<String> categoryList = new ArrayList<>();
		categoryList.add("FISH");
		categoryList.add("DOGS");
		categoryList.add("CATS");
		categoryList.add("REPTILES");
		categoryList.add("BIRDS");
		return categoryList;
	}
	
	@RequestMapping("/p2p/writeP2PPost.do") //�Ǹű� �ۼ��Ϸ� ���� 
	public String writeP2PPost(@ModelAttribute("P2PForm") P2PForm p2pForm, ModelMap model) throws Exception {
		//�ۼ��� form �� submit
		model.addAttribute("quantity", 1);
		return "tiles/P2pForm";
		
		}
	
	//����ϱ⸦ ������ �� ����� ���ε� 
	@RequestMapping("/p2p/sendP2PPost.do") //�Ǹű� �������� �����ֱ� 
	public String sendP2PPost(
			ModelMap model,
			@ModelAttribute("userSession") UserSession userSession,
			@ModelAttribute("P2PForm") P2PForm p2pForm,
			BindingResult bindingResult
			) throws Exception {
		//�ۼ��� form �� item �� �������� ���� 
		p2pFormvalidator.validate(p2pForm, bindingResult);
		
		if (bindingResult.hasErrors()) {
			return "tiles/P2pForm";
		}
		
//		MultipartFile file = p2pForm.getFile();
		String username = userSession.getAccount().getUsername();
		System.out.println(username);
		
		int item_seq = sequenceDao.getNextId("itemnum");
		
		String id = "P2P-" + item_seq;
		String pro_id;
		
		if (p2pForm.getCategory().equals("FISH")) {
			pro_id = "P2P-FI-" + item_seq;
		} else if (p2pForm.getCategory().equals("DOGS")) {
			pro_id = "P2P-DO-" + item_seq;
		}else if (p2pForm.getCategory().equals("CATS")) {
			pro_id = "P2P-CA-" + item_seq;
		}else if (p2pForm.getCategory().equals("REPTILES")) {
			pro_id = "P2P-RE-" + item_seq;
		}else {
			pro_id = "P2P-BI-" + item_seq;
		}
		
		
		Product pro = new Product();
		
		pro.setProductId(pro_id);
		pro.setCategoryId(p2pForm.getCategory());
		pro.setName(p2pForm.getItemName());
		pro.setDescription(p2pForm.getDiscription());
				
		P2P p2p = new P2P();
		p2p.setItemId(id);
		p2p.setPrice(p2pForm.getPrice());
		p2p.setTitle(p2pForm.getTitle());
		p2p.setId(username);
		
		Item item = new Item();
		item.setItemId(id);
		item.setProductId(pro_id);
		item.setListPrice(p2p.getPrice());
		item.setUnitCost(p2p.getPrice());
		item.setStatus("P");
//		item.setAttribute1(file);
		item.setQuantity(p2pForm.getQuantity());

		petStore.insertProduct(pro);	
		petStore.insertItem(item);
		petStore.insertInventoryQuantity(item);
		p2pService.insertP2P(p2p);
		
		model.addAttribute("p2p", p2p);
		model.addAttribute("product", pro);
		model.addAttribute("item", item);
		model.addAttribute("userId", username);
		return "tiles/Item";
	
		}
	
	@RequestMapping("/p2p/viewSellerPage.do")
	public String goSellerPage(HttpServletRequest request, @RequestParam("userId") String userId, ModelMap model) throws Exception {
		ArrayList<P2P> p2pList = new ArrayList<P2P>(this.p2pService.getP2PPostList(userId));
		System.out.println(p2pList.size());
		model.put("listnum", p2pList.size());
		model.put("p2pList", p2pList);
		model.put("userId", userId);
		return "tiles/SellerPage";
	}
}
