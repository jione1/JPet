package com.example.jpetstore.service;

import com.example.jpetstore.domain.Auction;

@Service("orderServiceImpl")
public class AuctionServiceImpl implements AuctionService {

	@Override
	public Auction getAuctionPost(int aucNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void partiAuc(int aucNum, int inputPrice, String userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAucStatus(boolean aucStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrderStatus(boolean orderStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMaxInputPrice(int aucNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findAucUserID(int maxPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
