package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Q_A;

public interface QADao {
	void insertQAPost(Q_A qa);
	void deleteQAPost(int qaNum);
	void updateQAPost(Q_A qa); //사용자가 글을 수정할 때 사용하는 메소드 
	void updateQAPost(int qaNum, String answer, String SelletId); //관리자가 답변 내용을 적을 때 사용하는 메소드 
	List<Q_A> getQAList(); //문의글 내용 리스트를 가져올 때 사용
	Q_A getQA(int itemId);
	Q_A getQA(String adId);
}
