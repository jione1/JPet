package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Auction;

public interface AuctionItemDao {
	void insertAucItem(Auction auction) throws DataAccessException;
	void updateAucStatus(int aucNum, boolean aucstatus) throws DataAccessException;
	// 지난 경매와 현재 경매를 구분하기 위한 상태 업데이트 메소드
	void updateAucItem(Auction auction) throws DataAccessException;
	List<Auction auction> getAuctionList() throws DataAccessException;
}
