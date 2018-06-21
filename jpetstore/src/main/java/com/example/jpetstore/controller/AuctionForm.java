package com.example.jpetstore.controller;

import java.io.Serializable;

import javax.xml.crypto.Data;

import com.example.jpetstore.domain.Auction;

@SuppressWarnings("serial")
public class AuctionForm implements Serializable {
	//jione
	private Auction auction;

	//aucparti
	private int inputPrice; //구매자들이 올리는 가격 저장
	private String userId;
	private int auction_num;

	//auction
	private int itemId; //주문을 위해 itemID를 부여
	private boolean orderStatus;
	private int maxPrice; //경매를 통해 부여되는 최고가격

	//autItem
	private String aucEnd;
	private String aucStatus; //낙찰 유무
	private String aucImage;
	private String aucDiscription; //경매에 올려지는 item의 설명
	private String aucName;
	private int price; //판매자가 올리는 최조 가격 (최저가격)
	private String itemName; //경매에 올려지는 item의 이름 
	private int partiId; //참가하는 구

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getAucEnd() {
		return aucEnd;
	}

	public void setAucEnd(String aucEnd) {
		this.aucEnd = aucEnd;
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

	public String getAucStatus() {
		return aucStatus;
	}

	public void setAucStatus(String aucStatus) {
		this.aucStatus = aucStatus;
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

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPartiId() {
		return partiId;
	}

	public void setPartiId(int partiId) {
		this.partiId = partiId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public boolean isAuctionStatus() {
		return auctionStatus;
	}

	public void setAuctionStatus(boolean auctionStatus) {
		this.auctionStatus = auctionStatus;
	}

	private String category;

	private String title;

	private String productId;

	private boolean auctionStatus;

}