package com.example.jpetstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpetstore.dao.AuctionDao;
import com.example.jpetstore.dao.AuctionItemDao;
import com.example.jpetstore.dao.AuctionPartiDao;
import com.example.jpetstore.domain.Auction;

@Service
public class AuctionServiceImpl implements AuctionService {

	@Autowired
	private AuctionItemDao auctionItemDao;


//	AuctionDao
	@Override
	public void insertMaxPrice(int aucNum, double maxPrice) {
		auctionItemDao.insertMaxPrice(aucNum, maxPrice);
	}
	
	@Override
	public void updateOrderStatus(int aucNum, boolean orderStatus) {
		// TODO Auto-generated method stub
		auctionItemDao.updateOrderStatus(aucNum, orderStatus);
	}

//  AuctionItemDao
	@Override
	public void insertAucItem(Auction auction) {
		auctionItemDao.insertAucItem(auction);
	}
	
	@Override
	public void updateAucStatus(int aucNum, boolean aucStatus) {
		// TODO Auto-generated method stub
		auctionItemDao.updateAucStatus(aucNum, aucStatus);
	}

	@Override
	public void updateAucItem(Auction auction) {
		auctionItemDao.updateAucItem(auction);
	}
	
// AuctionPartiDao
	@Override
	public void insertPrice(int aucNum, int inputPrice, String userID) {
		// TODO Auto-generated method stub
		auctionItemDao.insertPrice(aucNum, inputPrice, userID);
	}

	@Override
	public void deleteMaxInputPrice(int aucNum, String userID) {
		// TODO Auto-generated method stub
		auctionItemDao.deleteMaxPrice(aucNum, userID);
	}

	@Override
	public String findAucUserID(int maxPrice, String userID) {
		// TODO Auto-generated method stub
		auctionItemDao.findAucUserID(maxPrice, userID);
		
		return userID;
	}

	@Override
	public void partiAuc(int aucNum, int inputPrice, String userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Auction> getAucList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction getAuctionPost(int aucNum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int auctionListSize() {
		return auctionItemDao.auctionListSize();
	}
}
