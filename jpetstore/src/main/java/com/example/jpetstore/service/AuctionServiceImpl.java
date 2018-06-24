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

	@Override
	public List<Auction> getAuctionList() {
		// TODO Auto-generated method stub
		return null;
	}


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
	public void insertPrice(Auction auction){
		// TODO Auto-generated method stub
		auctionItemDao.insertPrice(auction);
	}


	@Override
	public void deleteMaxPrice(int aucNum) {
		// TODO Auto-generated method stub
		auctionItemDao.deleteMaxPrice(aucNum);
	}

	@Override
	public String findAucUserID(int aucNum) {
		// TODO Auto-generated method stub
		return auctionItemDao.findAucUserID(aucNum);
		
	}


	@Override
	public void partiAuc(int aucNum, int inputPrice, String userID) {
		// TODO Auto-generated method stub
		
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
	
	@Override
	public List<Auction> getLastAuctionList() {
		return auctionItemDao.getLastAuctionList();
	}
	@Override
	public List<Auction> getCurAuctionList() {
		return auctionItemDao.getCurAuctionList();
	}


	@Override
	public Auction getAuctionDetail(int aucNum) {
		// TODO Auto-generated method stub
		return auctionItemDao.getAuctionDetail(aucNum);
	}
	
	@Override
	public int findMaxPrice(int aucNum) {
		return auctionItemDao.findMaxPrice(aucNum);
	}
	
	@Override
	public int countInput(int auction_Num) {
		// TODO Auto-generated method stub
		return auctionItemDao.countInput(auction_Num);
	}
}