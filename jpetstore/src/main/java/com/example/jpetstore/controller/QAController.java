package com.example.jpetstore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.jpetstore.domain.Product;
import com.example.jpetstore.domain.QA;
import com.example.jpetstore.service.PetStoreFacade;
import com.example.jpetstore.service.QAService;

@Controller
@RequestMapping("qa")
@SessionAttributes("userSession")
public class QAController{
	
	@Value("tiles/QAForm")
	private String qaFormView;
	@Value("tiles/QAList")
	private String qaListView;
	@Autowired
	private QAService qaService;
	
	@Autowired
	private PetStoreFacade petStore;
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/qawriteform.do")
	public String writeQAForm(@ModelAttribute("qaFrom") QAForm qaForm) throws Exception {
		return qaFormView;
	}
	
	@ModelAttribute("QAList")
	public List<QA> getQAList(){
		List<QA> qaList = new ArrayList<QA>();
		qaList = qaService.getQAList();
		return qaList;
	}
	
	@RequestMapping("/qalist.do")
	public String QAList(@ModelAttribute("QAList") List<QA> qaList) {
		System.out.println(qaList.get(0).getTitle());
		return qaListView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String sendQAPost(
			HttpServletRequest request,
			@ModelAttribute("QAForm") QAForm qaForm,
			ModelMap model,
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		String username = userSession.getAccount().getUsername();
		System.out.println("Session ID" + username);
		
		
		return qaListView;  
	}
}
