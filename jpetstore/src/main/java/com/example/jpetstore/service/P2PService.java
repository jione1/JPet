package com.example.jpetstore.service;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import java.util.List;

public interface P2PService {
	//p2p

	void insertItem(Item item);
	//�Ǹ��ڰ� �ۼ��� p2p�� �ִ� item ������ �����Ѵ�. 

	void insertP2P(P2P p2p);
	//����ڰ� �Է��� p2p post�� ������ �����Ѵ�. 

	//void updateQuantity(int itemId, int quantity);
	//����ڰ� �ֹ�/ �ֹ���� ���� ��� item�� ������ �����Ѵ�. 

	List<P2P> getP2PPostList(String userId);
	//userId�� �´� p2p����Ʈ�� �޾ƿͼ� �Ǹ����������� �����Ѵ�. 

	Item getItem(String itemId, String userId); 
	//userId�� ������ �Ǹ��� �������� �����´�. 

	void updateP2P(P2P p2p);
	//�Ǹ��ڰ� ������ ������ �����Ͽ��� ��� ȣ��ȴ�. 
	List<P2P> getP2PList();
	
	P2P getP2PDetail(String itemId);
	
	P2P getP2PSeller(String itemId);
	
}
