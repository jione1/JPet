package com.example.jpetstore.service;

import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionService {
	void partiAuc(int aucNum, int inputPrice, String userID);
	
	void updateAucStatus(int aucNum, boolean aucStatus);
	
	void updateOrderStatus(int aucNum, boolean orderStatus);

	Auction getAuctionPost(int aucNum);

	void insertMaxPrice(int aucNum, double maxPrice);
	
	void insertAucItem(Auction auction);
	
	void updateAucItem(Auction auction);
	
	int auctionListSize();
	
	List<Auction> getCurAuctionList();
	
	List<Auction> getLastAuctionList();
	
	Auction getAuctionDetail(int aucNum);
	
	void deleteMaxPrice(int aucNum);
	
	void insertPrice(int aucNum, int inputPrice, String userID);
	
	String findAucUserID(int auction_Num);

}
