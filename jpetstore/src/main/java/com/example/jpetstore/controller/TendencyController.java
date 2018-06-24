package com.example.jpetstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jpetstore.domain.Tendency;
import com.example.jpetstore.domain.Tendency_WhatKind;

@Controller
public class TendencyController {
	
	@Value("tiles/testTendency")
	private String test;
	@Value("tiles/resultTendency")
	private String result;
	
	//성향분석을 위한 문제List
	public String[] questionList() throws Exception{
		return new String[]  {
				"호기심이 많하고 개성이 강하다",
				"형제가 없거나 외로움을 많이 탄다",
				"관심받는것을 좋아한다",
				"반려동물의 사망시 큰 상처를 받을 것 같다",
				"피부염이나 알레르기성 질환이 있다",
				"물건에 대한 애착이 강하다",
				"해야 할 일을 자주 잊어버린다",
				"혼자서도 조용히 장시간 즐겁게 놀 수 있다.",
				"시키지 않아도 스스로의 일을 찾아서 한다",
				"일찍자고 일찍 일어난다",
				"독립성이 강하다",
				"활동적인 것이 좋다"};
	}
	
	//메인에서 성향분석 시작 클릭시 맵핑
	@RequestMapping("/tendency/tendencyStart.do")
	public String tendencyStart(ModelMap model) throws Exception{
		
		//입력결과를 받은 Tendency객체와 문제List를 같이 View로 넘긴다
		model.addAttribute("testTendency", new Tendency());
		model.addAttribute("quest", questionList());
		return test;		 	
	}

	private String[] kind = {"cat", "dog", "dog", "bird", "fish", "cat", "fish", "fish", "bird", "bird", "cat", "dog"};
	
	//문제Form에서 분석하기 클릭시 맵핑 
	@RequestMapping("/tendency/sendResult.do")
	public String tendencyResult(HttpServletRequest request,
								@ModelAttribute("testTendency")Tendency tendency,
								ModelMap model) throws Exception {
				
		Tendency_WhatKind kindBean = new Tendency_WhatKind();
		kindBean.setKind(kind);
			
		//사용자 답변 분류 count[0]=dog, count[1]=cat,  count[2]=bird, count[3]=fish
			int[] count = {0,0,0,0};
			for(int i=0; i<questionList().length; i++ ) {
				if(tendency.getTestResult()[i] != null) {
					switch(kindBean.getKind()[i]) {
					case "dog":
						count[0]++; break;
					case "cat":
						count[1]++; break;
					case "bird":
						count[2]++; break;
					case "fish":
						count[3]++; break;
					}
				}
			}
			
		//분류결과 count를 compareTestResult Method를 호출해서 count를 비교한다  
		List<String> tendencyResult = tendency.compareTestResult(count);
		
		//비교 결과를 model에 담아 view로 전달한다 (동률일 경우 random으로 전달한다 )
		int pageIndex = (int)(Math.random()*tendencyResult.size());
		model.addAttribute("resultPage", tendencyResult.get(pageIndex));
		
		return result;
	}
}