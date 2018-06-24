package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionMapper {
	void insertMaxPrice(int aucNum, double maxPrice);
	void updateOrderStatus(int aucNum, boolean orderStatus);
	void insertAucItem(Auction auction);
	void updateAucStatus(int aucNum, boolean aucStatus);
	void updateAucItem(Auction auction);
	List<Auction> getLastAuctionList();
	List<Auction> getCurAuctionList();
	void insertPrice(int aucNum, int inputPrice,  String userID);
	
	int auctionListSize();
	Auction getAucDetail(int aucNum);
	void deleteMaxPrice(int aucNum);
	String findAucUserID(int aucNum);

	
}
