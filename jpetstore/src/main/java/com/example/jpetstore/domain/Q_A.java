package com.example.jpetstore.domain;

public class Q_A { //문의게시판을 위한 domain class
	private int QpostNum; //문의글 번호 
	private String Qtitle; //문의글 제목
	private String QDiscription; //문의글 내용
	private String QAnswer; //판매자의 답변
	private Boolean QIsAnswered; //답변이 올라왔는지의 유무
	private String QType;//문의종류 (답변의 편의성을 위해 설정)
	private String userID;
	private String AduserID;
	
	public Boolean isAnswered(int QPostNum) {
		return false;
	}
}
