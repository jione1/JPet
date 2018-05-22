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
//	//성향 분석하기 눌렀을 때 여기로 매핑됨 
//	@RequestMapping("/tendency/tendencyStart.do") //성향 분석 시작 
//	public String tendencyStart(
//			@RequestParam("tendecyQuestion") Tendency tendecyQuestion,
//			@ModelAttribute("userSession") UserSession userSession,
//			ModelMap model) throws Exception {
//		//문제 보내기 
//		
//		return "TestTendency"; //성향 분석하기 
//		
//		}
//
//	@RequestMapping("/tendency/sendResult.do") //성향 분석 결과 
//	public String tendencyResult(
//			@RequestParam("tendecyResult") Tendency tendecyResult,
//			@ModelAttribute("userSession") UserSession userSession,
//			ModelMap model) throws Exception {
//		//결과 계산 보여주기 
//		
//		return "ResultTendency";
//		
//		}
//	
//}