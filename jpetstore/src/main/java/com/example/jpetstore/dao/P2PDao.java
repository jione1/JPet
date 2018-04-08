package com.example.jpetstore.dao;

public interface P2PDao {
	void insertPost(P2P p2p) throws DataAccessException;
	void deletePost(int postNum, String userID) throws DataAccessException;
	void updatePost(P2P p2p) throws DataAccessException; //사용자가 글을 수정할 때 사용하는 메소드 
	List<P2P> getP2PPostList() throws DataAccessException; //post 내용 리스트를 가져올 때 사용
	
}
