package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Auction;

public interface AuctionPartiDao {
	void insertPrice(int aucNum, String userID) throws DataAccessException;
}
