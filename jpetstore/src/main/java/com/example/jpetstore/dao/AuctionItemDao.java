package com.example.jpetstore.dao;

import java.util.Date;
import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionItemDao {
	
	void insertAucItem(Auction auction);
	void updateAucStatus(int aucNum, boolean aucStatus);
	void updateAucItem(Auction auction);
	List<Auction> getCurAuctionList();

	List<Auction> getLastAuctionList();
	
	void insertPrice(Auction auction);
	
	void deleteMaxPrice(int acuNum);
	
	String findAucUserID(int auction_num);
	
	void insertMaxPrice(int aucNum, double maxPrice);



	void updateOrderStatus(int aucNum, boolean orderStatus);
	
	int auctionListSize();
	

	Auction getAuctionDetail(int aucNum);
	
	int findMaxPrice(int aucNum);
	
	void closeAuction(Date curTime);

	int countInput(int auction_Num);
	
}