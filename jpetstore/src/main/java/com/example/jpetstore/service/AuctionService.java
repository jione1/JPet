package com.example.jpetstore.service;

import java.util.List;

public interface AuctionService {
	void partiAuc(int aucNum, int inputPrice, String userID);
	//����ڰ� ���ǿ� �����ϸ鼭 ���ϴ� ������ ���� -> AucParti�� ������ ����
	
	void updateAucStatus(boolean aucStatus);
	//�������� �����ڰ� �ֹ��� ���� ��� aucstatus�� true�� �����Ͽ� ���� �����ϰ� �ִ� ���ǰ� �����Ѵ�.
	
	void updateOrderStatus(boolean orderStatus);
	//�������� �����ڰ� �ֹ��� ���� ��� orderStatus�� true�� �����Ͽ� ���� �����ϰ� �ִ� ���ǰ� �����Ѵ�.
	
	List<AucItem> getAucList();
	//��� ����Ʈ�� ��� �ҷ��´�. �������->aucstatus�� true / �������� ��� -> aucstatus�� false
	
	void deleteMaxInputPrice(int aucNum);
	//�������� ����ڰ� ������ �������� ��� inputprice�� ���� ���� ������ delete�� �Ŀ� maxprice�� �����Ѵ�.
	
	Auction getAuctionPost(int aucNum);
	//���ǹ�ȣ�� ���� ���� ����Ʈ�� ��ȯ�Ѵ�. 
	
	String findAucUserID(int maxPrice);
	//ū ���� �Է��� ������� ���̵� �޾ƿ´�. 
}
