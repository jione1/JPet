package com.example.jpetstore.dao;

public interface QADao {
	void insertQAPost(Q_A qa) throws DataAccessException;
	void deleteQAPost(int qaNum, String userID) throws DataAccessException;
	void updateQAPost(Q_A qa) throws DataAccessException; //사용자가 글을 수정할 때 사용하는 메소드 
	void answerQAPost(int qaNum, String answer, String adUserID); //관리자가 답변 내용을 적을 때 사용하는 메소드 
	List<Q_A> getQAList() throws DataAccessException; //문의글 내용 리스트를 가져올 때 사용
	
}
