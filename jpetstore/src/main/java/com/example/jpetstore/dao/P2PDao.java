package com.example.jpetstore.dao;

public interface P2PDao {
	void insertPost(P2P p2p) throws DataAccessException;
	void deletePost(int postNum, String userID) throws DataAccessException;
	void updatePost(P2P p2p) throws DataAccessException; //����ڰ� ���� ������ �� ����ϴ� �޼ҵ� 
	List<P2P> getP2PPostList() throws DataAccessException; //post ���� ����Ʈ�� ������ �� ���
	
}
