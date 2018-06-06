package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QA implements Serializable{
	private int qnum;
	private String userId;
	private String title;
	private String content;
	private String isAnswered;
	private int qtype;
	private String answeredTime;
	private Item itmeid;
	private Account sellerId;
	private Account adminId;
	
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIsAnswered() {
		return isAnswered;
	}
	public void setIsAnswered(String isAnswered) {
		this.isAnswered = isAnswered;
	}
	public int getQtype() {
		return qtype;
	}
	public void setQtype(int qtype) {
		this.qtype = qtype;
	}
	public String getAnsweredTime() {
		return answeredTime;
	}
	public void setAnsweredTime(String answeredTime) {
		this.answeredTime = answeredTime;
	}
	public Item getItmeid() {
		return itmeid;
	}
	public void setItmeid(Item itmeid) {
		this.itmeid = itmeid;
	}
	public Account getSellerId() {
		return sellerId;
	}
	public void setSellerId(Account sellerId) {
		this.sellerId = sellerId;
	}
	public Account getAdminId() {
		return adminId;
	}
	public void setAdminId(Account adminId) {
		this.adminId = adminId;
	}
	
	
}
