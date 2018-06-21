package com.example.jpetstore.dao;

import java.util.Date;

public interface AuctionDao {
	void insertMaxPrice(int aucNum, double maxPrice);
	void updateOrderStatus(int aucNum, boolean orderStatus);
}
