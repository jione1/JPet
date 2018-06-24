package com.example.jpetstore.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tendency {
	//사용자가 입력한 결과를 받아오기 위한 class
	
	private String[] testResult;
	public String[] getTestResult() {
		return testResult;
	}
	public void setTestResult(String[] testResult) {
		this.testResult = testResult;
	}
	public List<String> compareTestResult(int[] count) {
		
		//가장 높은 선호도 조사 
		int max = count[0];
		for(int i=1; i<count.length; i++) {
			if(max < count[i])
				max = count[i];
		}
		
		//동률이 있을 수 있는 가정에, max값을 가지는 count를 조사하여 List추가
		List<String> tendency = new ArrayList<String>();
		for(int i=0; i<count.length; i++) {
			if(max==count[i]) {
				switch(i) {
					case 0: tendency.add("dog"); break;
					case 1: tendency.add("cat"); break;
					case 2: tendency.add("bird"); break;
					case 3: tendency.add("fish"); break;
				}
			}
		}
		
		return tendency;
	}
}
