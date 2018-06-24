package com.example.jpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.service.KakaoLoginService;
import com.example.jpetstore.service.PetStoreFacade;
import com.fasterxml.jackson.databind.JsonNode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("userSession")
public class KakaoLoginController {

	@Autowired
	private KakaoLoginService kakaoLoginService;
	
	@ModelAttribute("userSession")
	@RequestMapping(value = "/kakaologin.do", produces = "application/json")
	public UserSession kakaoLogin(@RequestParam("code") String code, HttpServletRequest request, HttpServletResponse httpServletResponse, HttpSession session
			) {
		System.out.println("code: " + code);
		
//		JsonNode jsonToken = KakaoLogin.getAccessToken(code);
		
		JsonNode token = KakaoLogin.getAccessToken(code);
		JsonNode userInfo = KakaoLogin.getKakaoUserInfo(token.path("access_token").toString());

		Account account = new Account();
		
		//사용자 정보 요청
        // Get id
 		String id = userInfo.path("id").asText();
 		String nickname = null;
 		String thumbnailImage = null;
 		String profileImage = null;
 		String message = null;

        // 유저정보 카톡에서 가져오기 Get properties
		JsonNode properties = userInfo.path("properties");
		nickname = properties.path("nickname").asText();
		thumbnailImage = properties.path("thumbnail_image").asText();
		profileImage = properties.path("profile_image").asText();

		account.setUsername(nickname);
		account.setProfileImagePath(profileImage);
		
		String username = account.getUsername();
		kakaoLoginService.kakaoLogin(account);
		
		UserSession userSession = new UserSession(account);
		session.setAttribute("userSession", userSession);
		
		return userSession;
	}
}