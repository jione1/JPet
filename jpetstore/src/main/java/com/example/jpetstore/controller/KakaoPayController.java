
package com.example.jpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.jpetstore.domain.KakaoPayRequest;

@Controller
@RequestMapping("/kakaoPay/*")
public class KakaoPayController {
	
	@RequestMapping(value="readyPay", method=RequestMethod.POST)
	public static String readyPay(@ModelAttribute("kakaoPayRequest") KakaoPayRequest kakaoPayRequest) throws Exception {			
			return "redirect:"+(KakaoPayTest.readyPay(kakaoPayRequest));
	}
}