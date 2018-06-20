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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.jpetstore.domain.Product;
import com.example.jpetstore.domain.QA;
import com.example.jpetstore.service.PetStoreFacade;
import com.example.jpetstore.service.QAService;

@Controller
@RequestMapping("qa")
@SessionAttributes("userSession")
public class QAController{
	
	private int qaListLen = 0;
	@Value("tiles/QAForm")
	private String qaFormView;
	@Value("tiles/QAList")
	private String qaListView;
	@Value("tiles/QADetail")
	private String qaDetailView;
	@Autowired
	private QAService qaService;
	
	@Autowired
	private PetStoreFacade petStore;
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/qawriteform.do")
	public String writeQAForm(@ModelAttribute("qaForm") QAForm qaForm) throws Exception {
		return qaFormView;
	}
	
	@ModelAttribute("QAList")
	public List<QA> getQAList(){
		List<QA> qaList = new ArrayList<QA>();
		qaList = qaService.getQAList();
		qaListLen = qaList.size();
		return qaList;
	}
	
	@RequestMapping("/qalist.do")
	public String QAList(@ModelAttribute("QAList") List<QA> qaList) {
		return qaListView;
	}
	
	@RequestMapping("/qawrite.do")
	public String sendQAPost(HttpServletRequest request, @ModelAttribute("QAForm") QAForm qaForm,
			ModelMap model, @ModelAttribute("userSession") UserSession userSession) throws Exception {
		String username = userSession.getAccount().getUsername();
		System.out.println("Session ID" + username);
		
		QA qa = new QA();
		qa.setQnum(qaListLen + 1);
		qa.setUserId(username);
		qa.setTitle(qaForm.getQaTitle());
		qa.setContent(qaForm.getQaContent());
		qa.setIsAnswered("false");
		qa.setQtype(qaForm.getQaType());
		
		qaService.insertQA(qa);
		return "redirect:" + "/qa/qalist.do";
	}
	
		
	@RequestMapping("/qaDetail.do")
	public ModelAndView detailQA(@RequestParam("qnum") int qnum) throws Exception{
		ModelAndView qaDetail = new ModelAndView();
		QA detailQa = new QA();
		detailQa = qaService.getQA(qnum);
		qaDetail.setViewName(qaDetailView);
		qaDetail.addObject("QADetail", detailQa);
		return qaDetail;
	}
}