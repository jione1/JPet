package com.example.jpetstore.service;

import java.util.Date;
import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionService {
	void partiAuc(int aucNum, int inputPrice, String userID);
	
	void updateAucStatus(int aucNum, boolean aucStatus);
	
	void updateOrderStatus(int aucNum, boolean orderStatus);

	Auction getAuctionPost(int aucNum);

	void insertMaxPrice(int aucNum, double maxPrice);
	
	void insertAucItem(Auction auction);
	
	void deleteMaxPrice(int aucNum);

	int auctionListSize();
	

	List<Auction> getCurAuctionList();
	
	List<Auction> getLastAuctionList();
	
	void insertPrice(Auction auction);
	String findAucUserID(int auction_num);

	void updateAucItem(Auction auction);
	List<Auction> getAuctionList();

	Auction getAuctionDetail(int auction_Num);

	int findMaxPrice(int auctNum);
	
	int countInput(int auction_Num);
}
