//package com.example.jpetstore.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.annotation.ModelAttribute;
//
//import com.example.jpetstore.domain.Tendency;
//import com.example.jpetstore.service.PetStoreFacade;
//
//
//@Controller
//@SessionAttributes("userSession ")
//public class TendencyController {
//	
//	private PetStoreFacade petStore;
//	
//	@Autowired
//	public void setPetStore(PetStoreFacade petStore) {
//		this.petStore = petStore;
//	}
//	
//	private Tendency tendency;
//	
////	@Autowired
////	public void setTendency(Tendency tendency) {
////		this.tendency = tendency;
////	}
//	
//	//���� �м��ϱ� ������ �� ����� ���ε� 
//	@RequestMapping("/tendency/tendencyStart.do") //���� �м� ���� 
//	public String tendencyStart(
//			@RequestParam("tendecyQuestion") Tendency tendecyQuestion,
//			@ModelAttribute("userSession") UserSession userSession,
//			ModelMap model) throws Exception {
//		//���� ������ 
//		
//		return "TestTendency"; //���� �м��ϱ� 
//		
//		}
//
//	@RequestMapping("/tendency/sendResult.do") //���� �м� ��� 
//	public String tendencyResult(
//			@RequestParam("tendecyResult") Tendency tendecyResult,
//			@ModelAttribute("userSession") UserSession userSession,
//			ModelMap model) throws Exception {
//		//��� ��� �����ֱ� 
//		
//		return "ResultTendency";
//		
//		}
//	
//}