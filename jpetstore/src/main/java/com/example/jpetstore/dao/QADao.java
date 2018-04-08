package com.example.jpetstore.dao;

public interface QADao {
	void insertQAPost(Q_A qa) throws DataAccessException;
	void deleteQAPost(int qaNum, String userID) throws DataAccessException;
	void updateQAPost(Q_A qa) throws DataAccessException; //����ڰ� ���� ������ �� ����ϴ� �޼ҵ� 
	void answerQAPost(int qaNum, String answer, String adUserID); //�����ڰ� �亯 ������ ���� �� ����ϴ� �޼ҵ� 
	List<Q_A> getQAList() throws DataAccessException; //���Ǳ� ���� ����Ʈ�� ������ �� ���
	
}
