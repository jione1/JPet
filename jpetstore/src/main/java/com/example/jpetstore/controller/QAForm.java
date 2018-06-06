package com.example.jpetstore.controller;

//import com.example.jpetstore.domain.Account;

public class QAForm {
//	private int qaNum;
//	private Account writerAccount;
	private String qaTitle;
	private String qaContent;
	private int qaType;
	
//	public int getQaNum() {
//		return qaNum;
//	}
//	public void setQaNum(int qaNum) {
//		this.qaNum = qaNum;
//	}
//	public String getWriterAccount() {
//		return writerAccount.getUsername();
//	}
//	public void setWriterAccount(Account writerAccount) {
//		this.writerAccount = writerAccount;
//	}
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
}
