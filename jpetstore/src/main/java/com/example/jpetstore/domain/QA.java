package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QA implements Serializable{
	private int qaNum;
	private String postId;
	private String title;
	private String content;
	private int type;
	
	public int getQaNum() {
		return qaNum;
	}
	public void setQaNum(int qaNum) {
		this.qaNum = qaNum;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
