package com.example.jpetstore.dao;

import com.example.jpetstore.domain.P2P;
import java.util.*;

public interface P2PDao {
	void insertPost(P2P p2p);
	
	void updatePost(P2P p2p); //����ڰ� ���� ������ �� ����ϴ� �޼ҵ� 
	List<P2P> getP2PPostList(String userId); //post ���� ����Ʈ�� ������ �� ���
	P2P getP2PDetail(String itemId);
	List<P2P> getP2PList();
	P2P getP2PSeller(String itemId);
}
