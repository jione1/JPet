package com.example.jpetstore.dao;

public interface AuctionPartiDao {
	void insertPrice(int aucNum, int inputPrice,  String userID);
	
	void deleteMaxPrice(int acuNum);
	
	String findAucUserID(int aucNum);
}