package com.example.jpetstore.controller;

import java.io.Serializable;

import com.example.jpetstore.domain.Auction;

@SuppressWarnings("serial")
public class AuctionForm implements Serializable {
	
	private Auction auction;
	
	private boolean auctionStatus;

	public AuctionForm(Auction auction) {
		this.auction = auction;
		this.auctionStatus = false;
	}

	public AuctionForm() {
		this.auction = new Auction();
		this.auctionStatus = true;
	}

	public Auction getAuction() {
		return auction;
	}

	public boolean autionStatus() {
		return auctionStatus;
	}
}
