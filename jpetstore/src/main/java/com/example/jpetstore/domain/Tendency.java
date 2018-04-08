package com.example.jpetstore.domain;

import java.util.HashMap;
import java.util.Map;

public class Tendency {//성향 테스트를 위한 domain class

	private Map<Integer, Boolean> testResult = new HashMap<Integer, Boolean>(); 
	//회원의 테스트 결과를 map 형태로 받아온다. integer은 테스트 번호, boolean은 회원의 답변결과 (T/F)
	private Account account;//참여한 회원의 아이디
	private Map<Integer, Boolean> bird = new HashMap<Integer, Boolean>(); 
	//관리자가 설정한 bird 성향의 이상적인 답변 (70% 이상이면 해당 성향으로 결정)-> map으로 해당 테스트 번호와 답안을 비교한다. 
	private Map<Integer, Boolean> dog = new HashMap<Integer, Boolean>();
	//관리자가 설정한 dog 성향의 이상적인 답변 (70% 이상이면 해당 성향으로 결정)
	private Map<Integer, Boolean> cat = new HashMap<Integer, Boolean>();
	//관리자가 설정한 cat 성향의 이상적인 답변 (70% 이상이면 해당 성향으로 결정)
	private Map<Integer, Boolean> reptiles = new HashMap<Integer, Boolean>();
	//관리자가 설정한 reptiles 성향의 이상적인 답변 (70% 이상이면 해당 성향으로 결정)
	private Map<Integer, Boolean> fish = new HashMap<Integer, Boolean>();
	//관리자가 설정한 fish 성향의 이상적인 답변 (70% 이상이면 해당 성향으로 결정)
	private String tendecyResult; //해당 회원의 결과를 저장 

	public String compareTestResult(Map<Integer, Boolean> userResult) {
		
	}
}
