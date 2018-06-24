package com.example.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.AuctionDao;
import com.example.jpetstore.dao.AuctionItemDao;
import com.example.jpetstore.dao.AuctionPartiDao;
import com.example.jpetstore.dao.mybatis.mapper.AuctionMapper;
import com.example.jpetstore.domain.Auction;
@Repository
public class MybatisAuctionDao implements  AuctionItemDao{
	@Autowired
	private AuctionMapper auctionMapper;
	
	@Override
	public void insertPrice(int aucNum, int inputPrice, String userID) {
		// TODO Auto-generated method stub
		auctionMapper.insertPrice(aucNum, inputPrice, userID);
	}

	@Override
	public void deleteMaxPrice(int aucNum) {
		// TODO Auto-generated method stub
		auctionMapper.deleteMaxPrice(aucNum);
	}
                                                                                                    
	@Override
	public String findAucUserID(int aucNum) {
		// TODO Auto-generated method stub
		return auctionMapper.findAucUserID(aucNum);
	}

	@Override
	public void insertAucItem(Auction auction) {
		// TODO Auto-generated method stub
		auctionMapper.insertAucItem(auction);
	}

	@Override
	public void updateAucStatus(int aucNum, boolean aucStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAucItem(Auction auction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrderStatus(int aucNum, boolean orderStatus) {
		// TODO Auto-generated method stub
		
	}

	public int auctionListSize() {
		return auctionMapper.auctionListSize();
	}
	
	public List<Auction> getAuctionList() {
		return auctionMapper.getAuctionList();
	}

	@Override
	public Auction getAuctionDetail(int aucNum) {
		// TODO Auto-generated method stub
		return auctionMapper.getAuctionDetail(aucNum);
	}
}
