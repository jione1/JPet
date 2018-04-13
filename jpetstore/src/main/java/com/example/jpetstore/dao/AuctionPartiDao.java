package com.example.jpetstore.dao;

public interface AuctionPartiDao {
	void insertPrice(int aucNum, int inputPrice,  String userID) throws DataAccessException;
	
	void deleteMaxPrice(int acuNum, String userID) throws DataAccessException;
	
	String findAucUserID(int maxPrice, String userID) throws DataAccessException;
}
