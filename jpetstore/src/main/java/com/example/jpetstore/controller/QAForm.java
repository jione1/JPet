package com.example.jpetstore.controller;

//import com.example.jpetstore.domain.Account;

public class QAForm {
	private String qaTitle;
	private String qaContent;
	private int qaType;
	private String answer;
	private String sellerId;
	private String itemId;
	
	public String getQaTitle() {
		return qaTitle;
	}
	public void setQaTitle(String title) {
		this.qaTitle = title;
	}
	public String getQaContent() {
		return qaContent;
	}
	public void setQaContent(String content) {
		this.qaContent = content;
	}
	public int getQaType() {
		return qaType;
	}
	public void setQaType(int type) {
		this.qaType = type;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
}
