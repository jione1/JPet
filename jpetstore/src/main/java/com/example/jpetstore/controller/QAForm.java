package com.example.jpetstore.controller;

import com.example.jpetstore.domain.Account;

public class QAForm {
	private int qaNum;
	private Account writerAccount;
	private String qaTitle;
	private String qaContent;
	private int qaType;
	
	public int getQaNum() {
		return qaNum;
	}
	public void setQaNum(int qaNum) {
		this.qaNum = qaNum;
	}
	public String getWriterAccount() {
		return writerAccount.getUsername();
	}
	public void setWriterAccount(Account writerAccount) {
		this.writerAccount = writerAccount;
	}
	public String getTitle() {
		return qaTitle;
	}
	public void setTitle(String title) {
		this.qaTitle = title;
	}
	public String getContent() {
		return qaContent;
	}
	public void setContent(String content) {
		this.qaContent = content;
	}
	public int getType() {
		return qaType;
	}
	public void setType(int type) {
		this.qaType = type;
	}
}
