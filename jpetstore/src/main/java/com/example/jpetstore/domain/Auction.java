package com.example.jpetstore.domain;

public class Auction {
	//경매 item을 정의

	 private int acuNum;
	 private int itemId; //주문을 위해 itemID를 부여
	 private int MaxPrice; //경매를 통해 부여되는 최고가격
	 private int inputPrice; //구매자들이 올리는 가격 저장
	 private String userId; //참가하는 구매자들의 id
	 private boolean aucStatus; //낙찰 유무
	 private String itemName; //경매에 올려지는 item의 이름 
	 private String discription; //경매에 올려지는 item의 설명
	 private int unitCost; //판매자가 올리는 최조 가격 (최저가격)

	 public Boolean isSold(int itemId) {
	 }
	 
}
