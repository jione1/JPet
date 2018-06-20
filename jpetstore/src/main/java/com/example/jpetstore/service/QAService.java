package com.example.jpetstore.service;

import java.util.List;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.QA;

public interface QAService {
		//새로운 QA글 삽입
		void insertQA(QA qa);
		
		void insertQASeller(QA qa);
		
		//작성한 QA글 삭제
		void deletQA(int qaNum, Account SessionAccount);
		
		//작성한 QA글 수정
		void updateQA(QA qa);
		
		//QA글 목록보기
		List<QA> getQAList();
		
		//QA글 자세히 보기
		QA getQA(int qaNum);
}
