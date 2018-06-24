package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.QA;

public interface QAMapper {
	
	//새로운 QA글 삽입
	void insertQAPost(QA qa);
	void insertQASellerPost(QA qa);
	
	//작성한 QA글 삭제
	void deleteQAPost(int qnum);
	
	//작성한 QA글 수정
	void updateQAPost(QA qa);
	
	//QA글 목록보기
	List<QA> getQAList();
	
	//QA글 자세하게 보기
	QA getQA(int qaNum);
	
	void insertQAReply(QA qa);
}
