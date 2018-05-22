//package com.example.jpetstore.service;
//
//import com.example.jpetstore.dao.AuctionDao;
//import com.example.jpetstore.dao.AuctionItemDao;
//import com.example.jpetstore.dao.AuctionPartiDao;
//
//@Service("orderServiceImpl")
//public class AuctionServiceImpl implements AuctionService {
//
//	@Autowired
//	private AuctionDao auctionDao;
//	
//	@Autowired
//	private AuctionItemDao autionItemDao;
//	
//	@Autowired
//	private AuctionPartiDao autionPartiDao;
//	
//
////	AuctionDao
//	@Override
//	public void insertMaxPrice(int aucNum, double maxPrice) {
//		auctionDao.insertMaxPrice(aucNum, maxPrice);
//	}
//	
//	@Override
//	public void updateOrderStatus(int aucNum, boolean orderStatus) {
//		// TODO Auto-generated method stub
//		auctionDao.updateOrderStatus(aucNum, orderStatus);
//	}
//
////  AuctionItemDao
//	@Override
//	public void insertAucItem(Auction auction) {
//		autionItemDao.insertAucItem(auction);
//	}
//	
//	@Override
//	public void updateAucStatus(int aucNum, boolean aucStatus) {
//		// TODO Auto-generated method stub
//		auctionItemDao.updateAucStatus(acuNum, aucStatus);
//	}
//
//	@Override
//	public void updateAucItem(Auction auction) {
//		AuctionItemDao.updateAucItem(aution);
//	}
//	
//// AuctionPartiDao
//	@Override
//	public void insertPrice(int aucNum, int inputPrice, String userID) {
//		// TODO Auto-generated method stub
//		autionPartiDao.insertPrice(aucNum, inputPrice, userID);
//	}
//
//	@Override
//	public void deleteMaxInputPrice(int aucNum, String userID) {
//		// TODO Auto-generated method stub
//		autionPartiDao.deleteMaxPrice(acuNum, userID);
//	}
//
//	@Override
//	public String findAucUserID(int maxPrice, String userID) {
//		// TODO Auto-generated method stub
//		autcionPartiDao.findAucUser(maxPrice, userID);
//		
//		return userID;
//	}
//	
//}
