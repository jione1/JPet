package com.example.jpetstore.dao;

import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionItemDao {
	
	void insertAucItem(Auction auction);
	void updateAucStatus(int aucNum, boolean aucStatus);
	void updateAucItem(Auction auction);
	List<Auction> getAuctionList();
	void insertPrice(int aucNum, int inputPrice,  String userID);
	
	void deleteMaxPrice(int acuNum, String userID);
	
	String findAucUserID(int maxPrice, String userID);
	void insertMaxPrice(int aucNum, double maxPrice);
	void updateOrderStatus(int aucNum, boolean orderStatus);
	int auctionListSize();
	
}
