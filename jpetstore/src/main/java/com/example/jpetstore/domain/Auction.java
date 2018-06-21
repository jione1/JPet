package com.example.jpetstore.domain;

import java.io.Serializable;
import java.util.Date;

import javax.xml.crypto.Data;

@SuppressWarnings("serial")
public class Auction implements Serializable {
	//경매 item을 정의
	private Product product;
	private Item item;
	//aucparti
	private int inputPrice; //구매자들이 올리는 가격 저장
	private String userId;
	private int auction_num;

	//auction
	private String itemId; //주문을 위해 itemID를 부여
	private String aucEnd;
	private boolean orderStatus;
	private int maxPrice; //경매를 통해 부여되는 최고가격

	//autItem
	private String aucStatus; //낙찰 유무
	private String aucImage;
	private String aucDiscription; //경매에 올려지는 item의 설명
	private String aucName;//title
	private int price; //판매자가 올리는 최조 가격 (최저가격)
	private String itemName; //경매에 올려지는 item의 이름 
	private int partiId; //참가하는 구매자들의 id

	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public String getAucEnd() {
		return aucEnd;
	}


	public void setAucEnd(String endTime) {
		this.aucEnd = endTime;
	}

	


	public String isSold(int itemId) {
		return aucStatus;
	}


	public int getInputPrice() {
		return inputPrice;
	}

	public void setInputPrice(int inputPrice) {
		this.inputPrice = inputPrice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAuction_num() {
		return auction_num;
	}

	public void setAuction_num(int auction_num) {
		this.auction_num = auction_num;
	}

	public String isAucStatus() {
		return aucStatus;
	}


	public void setAucStatus(String string) {
		this.aucStatus = string;
	}


	public boolean isOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getAucImage() {
		return aucImage;
	}

	public void setAucImage(String aucImage) {
		this.aucImage = aucImage;
	}

	public String getAucDiscription() {
		return aucDiscription;
	}

	public void setAucDiscription(String aucDiscription) {
		this.aucDiscription = aucDiscription;
	}

	public String getAucName() {
		return aucName;
	}

	public void setAucName(String aucName) {
		this.aucName = aucName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int auctionCost) {
		this.price = auctionCost;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getPartiId() {
		return partiId;
	}

	public void setPartiId(int partiId) {
		this.partiId = partiId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}	 
}