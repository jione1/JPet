package com.example.jpetstore.service;

import com.example.jpetstore.domain.Q_A;

public interface QAService {
	//문의하기 

	void insertQA(Q_A qa);
	//사용자가 작성한 문의글을 저장한다. 

	void updateQA(Q_A qa);
	//사용자가 문의글을 변경하였을 때 사용

	void updateQA(int qaNum, String answer, String sellerId);
	//관리자나 판매자가 답변을 달았을 때 사용

	void deleteQA(int qnum);
	//사용자가 문의글을 삭제할 때 사용

	List<Q_A> getQAList();
	//문의글 전부를 불러올 때 사용

	Q_A getQA(int itemId);
	//판매자의 item에 따른 문의글을 가져올 때 사용

	Q_A getQA(String adId);
	//관리자에게 작성한 문의글을 가져올 때 사
}
