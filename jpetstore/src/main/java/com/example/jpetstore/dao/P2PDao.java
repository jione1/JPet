package com.example.jpetstore.dao;

import com.example.jpetstore.domain.P2P;

public interface P2PDao {
	void insertPost(P2P p2p);
	void deletePost(int postNum);
	void updatePost(P2P p2p); //사용자가 글을 수정할 때 사용하는 메소드 
	List<P2P> getP2PPostList(String userId); //post 내용 리스트를 가져올 때 사용
	
}
