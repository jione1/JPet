package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionMapper {

	void updateOrderStatus(int aucNum, boolean orderStatus);
	void insertAucItem(Auction auction);
	void updateAucStatus(int aucNum, boolean aucStatus);
	void updateAucItem(Auction auction);
	List<Auction> getAuctionList();

	void insertPrice(Auction auction);
//	void insertPrice(int auction_Num, int inputPrice, String userID);
	
	void deleteMaxPrice(int aucNum);
	
	String findAucUserID(int aucNum);
	
	int auctionListSize();
	
	Auction getAuctionDetail(int aucNum);

}
