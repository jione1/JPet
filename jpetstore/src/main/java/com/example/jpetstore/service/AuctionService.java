package com.example.jpetstore.service;

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
	
	void deleteMaxInputPrice(int aucNum, String userID);
	//�������� ����ڰ� ������ �������� ��� inputprice�� ���� ���� ������ delete�� �Ŀ� maxprice�� �����Ѵ�.
	
	Auction getAuctionPost(int aucNum);
	//���ǹ�ȣ�� ���� ���� ����Ʈ�� ��ȯ�Ѵ�. 
	
	String findAucUserID(int maxPrice, String userID);
	//ū ���� �Է��� ������� ���̵� �޾ƿ´�.
	
	void insertMaxPrice(int aucNum, double maxPrice);
	void insertAucItem(Auction auction);
	void updateAucItem(Auction auction);
	void insertPrice(int aucNum, int inputPrice, String userID);
	int auctionListSize();
	List<Auction> getAuctionList();
}
