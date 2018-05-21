package com.example.jpetstore.service;

import java.util.List;

public interface AuctionService {
	void partiAuc(int aucNum, int inputPrice, String userID);
	//사용자가 옥션에 참가하면서 원하는 가격을 적음 -> AucParti에 데이터 삽입
	
	void updateAucStatus(boolean aucStatus);
	//낙찰받은 참여자가 주문을 했을 경우 aucstatus를 true로 설정하여 현재 진행하고 있는 옥션과 구별한다.
	
	void updateOrderStatus(boolean orderStatus);
	//낙찰받은 참여자가 주문을 했을 경우 orderStatus를 true로 설정하여 현재 진행하고 있는 옥션과 구별한다.
	
	List<AucItem> getAucList();
	//경매 리스트를 모두 불러온다. 지난경매->aucstatus가 true / 진행중인 경매 -> aucstatus가 false
	
	void deleteMaxInputPrice(int aucNum);
	//낙찰받은 사용자가 낙찰을 포기했을 경우 inputprice중 가장 높은 가격을 delete한 후에 maxprice를 변경한다.
	
	Auction getAuctionPost(int aucNum);
	//옥션번호에 따른 옥션 포스트를 반환한다. 
	
	String findAucUserID(int maxPrice);
	//큰 값을 입력한 사용자의 아이디를 받아온다. 
}
