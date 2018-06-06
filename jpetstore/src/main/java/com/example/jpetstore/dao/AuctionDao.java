package com.example.jpetstore.dao;

public interface AuctionDao {
	void insertMaxPrice(int aucNum, double maxPrice);
	void updateOrderStatus(int aucNum, boolean orderStatus);
}
