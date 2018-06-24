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
	@Value("tiles/QAReplyForm")
	private String qaReplyFormView;
	@Autowired
	private QAService qaService;
	
	@Autowired
	private PetStoreFacade petStore;
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/qawriteform.do")
	public String writeQAForm(@ModelAttribute("qaForm") QAForm qaForm) throws Exception {
		qaForm.setQaType(1);
		return qaFormView;
	}
	
	@RequestMapping("/qawriteToSeller.do")
	public String writeQAFormToSeller(@RequestParam("sellerId") String sellerId, @RequestParam("itemId") String itemId, @ModelAttribute("qaForm") QAForm qaForm) throws Exception{
		qaForm.setQaType(2);
		qaForm.setSellerId(sellerId);
		qaForm.setItemId(itemId);
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
	
	@RequestMapping(value = "/qawrite.do", method = RequestMethod.POST)
	public String sendQAPost(HttpServletRequest request, @ModelAttribute("qaForm") QAForm qaForm,
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
		
		if(qaForm.getQaType() == 2) {
			qa.setSellerId(qaForm.getSellerId());
			qa.setItemid(qaForm.getItemId());
			qaService.insertQASeller(qa);
		}

		else {
			qaService.insertQA(qa);
		}
		
		return "redirect:" + "/qa/qalist.do";
	}
	
	@RequestMapping("/qaDetail.do")
	public ModelAndView detailQA(@RequestParam("qnum") int qnum, @ModelAttribute("userSession") UserSession userSession) throws Exception{
		ModelAndView qaDetail = new ModelAndView();
		QA detailQa = new QA();
		detailQa = qaService.getQA(qnum);
		qaDetail.setViewName(qaDetailView);
		qaDetail.addObject("QADetail", detailQa);
		return qaDetail;
	}
	
	@RequestMapping("/qaDelete.do")
	public String deleteQA(@RequestParam("qnum") int qnum) throws Exception{
		qaService.deleteQAPost(qnum);
		return "redirect:" + "/qa/qalist.do";
	}
	
	
	@RequestMapping("/qaReply.do")
	public String ReplyQA(@RequestParam("qnum") int qnum, @ModelAttribute("qaReplyForm") QAForm qaForm) throws Exception{
		qaForm.setQaType(qnum);
		return qaReplyFormView;
	}
	
	@RequestMapping("/qaReplyWrite.do")
	public String sendQAReplyPost(@ModelAttribute("qaReplyForm") QAForm qaForm) throws Exception {
		
		QA qa = new QA();
		qa.setQnum(qaForm.getQaType());
		qa.setIsAnswered(qaForm.getAnswer());

		qaService.insertQAReply(qa);
		
		return "redirect:" + "/qa/qalist.do";
	}
	
}
