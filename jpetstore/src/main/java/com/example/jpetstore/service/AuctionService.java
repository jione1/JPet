package com.example.jpetstore.service;

import java.util.Date;
import java.util.List;

import com.example.jpetstore.domain.Auction;

public interface AuctionService {
	void partiAuc(int aucNum, int inputPrice, String userID);
	//����ڰ� ���ǿ� �����ϸ鼭 ���ϴ� ������ ���� -> AucParti�� ������ ����
	
	void updateAucStatus(int aucNum, boolean aucStatus);
	//�������� �����ڰ� �ֹ��� ���� ��� aucstatus�� true�� �����Ͽ� ���� �����ϰ� �ִ� ���ǰ� �����Ѵ�.
	
	void updateOrderStatus(int aucNum, boolean orderStatus);
	//�������� �����ڰ� �ֹ��� ���� ��� orderStatus�� true�� �����Ͽ� ���� �����ϰ� �ִ� ���ǰ� �����Ѵ�.
	
	//��� ����Ʈ�� ��� �ҷ��´�. �������->aucstatus�� true / �������� ��� -> aucstatus�� false
	
	void deleteMaxPrice(int aucNum);
	//�������� ����ڰ� ������ �������� ��� inputprice�� ���� ���� ������ delete�� �Ŀ� maxprice�� �����Ѵ�.
	
	Auction getAuctionPost(int aucNum);
	//���ǹ�ȣ�� ���� ���� ����Ʈ�� ��ȯ�Ѵ�. 
	
	String findAucUserID(int auction_Num);
	//ū ���� �Է��� ������� ���̵� �޾ƿ´�.
	
	void insertAucItem(Auction auction);
	void updateAucItem(Auction auction);
	
	void insertPrice(Auction auction);
//	void insertPrice(int auction_Num, int inputPrice, String userID);
	
	int auctionListSize();
	List<Auction> getAuctionList();

	Auction getAuctionDetail(int auction_Num);

	int findMaxPrice(int auctNum);

	//void insertAucItem(String userId, String itemName, String string, int maxPrice, int auction_num, Date endtime);

}
