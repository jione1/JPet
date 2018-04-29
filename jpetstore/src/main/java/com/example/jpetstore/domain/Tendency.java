package com.example.jpetstore.domain;

import java.util.HashMap;
import java.util.Map;

@Component
public class Tendency {//성향 테스트를 위한 domain class

	private String[] testResult; 
	//회원의 테스트 결과를 map 형태로 받아온다. integer은 테스트 번호, boolean은 회원의 답변결과 (T/F)
	private Account account;//참여한 회원의 아이디
	
	@Value("#{tendency['bird.Answer']}")
	private String[] bird; 
	//관리자가 설정한 bird 성향의 이상적인 답변이 저장된 bird.properties 의 값을 문자열 배열로 받아서 사용자의 값과 비교한다. 
	
	@Value("#{tendency['dog.Answer']}")
	private String[] dog;
	//관리자가 설정한 dog 성향의 이상적인 답변이 저장된 dog.properties 의 값을 문자열 배열로 받아서 사용자의 값과 비교한다. 
	
	@Value("#{tendency['cat.Answer']}")
	private String[] cat;
	//관리자가 설정한 cat 성향의 이상적인 답변이 저장된 cat.properties 의 값을 문자열 배열로 받아서 사용자의 값과 비교한다.
	
	@Value("#{tendency['reptiles.Answer']}")
	private String[] reptiles;
	//관리자가 설정한 reptiles 성향의 이상적인 답변이 저장된 reptiles.properties 의 값을 문자열 배열로 받아서 사용자의 값과 비교한다.
	
	
	@Value("#{tendency['reptiles.Answer']}")
	private String[] fish;
	//관리자가 설정한 fish 성향의 이상적인 답변이 저장된 fish.properties 의 값을 문자열 배열로 받아서 사용자의 값과 비교한다.
	
	private String tendecyResult; //해당 회원의 결과를 저장 

	public String compareTestResult(Map<Integer, Boolean> userResult) {
		
	}
}
