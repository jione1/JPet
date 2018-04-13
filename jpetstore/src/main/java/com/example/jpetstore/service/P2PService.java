package com.example.jpetstore.service;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
   
public interface P2PService {
	//p2p

	void insertItem(Item item);
	//판매자가 작성한 p2p에 있는 item 정보를 저장한다. 

	void insertP2P(P2P p2p);
	//사용자가 입력한 p2p post의 정보를 삽입한다. 

	//void updateQuantity(int itemId, int quantity);
	//사용자가 주문/ 주문취소 했을 경우 item의 수량을 변경한다. 

	List<P2P> getP2PList(String userId);
	//userId에 맞는 p2p리스트를 받아와서 판매자페이지를 구성한다. 

	Item getItem(String itemId, String userId); 
	//userId가 있으면 판매자 아이템을 가져온다. 

	void deleteItem(int postNum);
	//cascade를 이용해서 연계된 p2p도 지운다. 

	void updateP2P(P2P p2p);
	//판매자가 아이템 정보를 수정하였을 경우 호출된다. 

}
