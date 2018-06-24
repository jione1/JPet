package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionMapper {

	void updateOrderStatus(int aucNum, boolean orderStatus);
	void insertAucItem(Auction auction);
	void updateAucStatus(int aucNum, boolean aucStatus);
	void updateAucItem(Auction auction);
	List<Auction> getAuctionList();

	Auction getAuctionDetail(int aucNum);
	
	void insertPrice(Auction auction);

	void deleteMaxPrice(int aucNum);
	
	String findAucUserID(int aucNum);
	
	int auctionListSize();
	
	int findMaxPrice(int aucNum);
}
