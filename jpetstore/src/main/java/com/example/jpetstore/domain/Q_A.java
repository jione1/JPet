package com.example.jpetstore.domain;

public class Q_A { //���ǰԽ����� ���� domain class
	private int QpostNum; //���Ǳ� ��ȣ 
	private String Qtitle; //���Ǳ� ����
	private String QDiscription; //���Ǳ� ����
	private String QAnswer; //�Ǹ����� �亯
	private Boolean QIsAnswered; //�亯�� �ö�Դ����� ����
	private String QType;//�������� (�亯�� ���Ǽ��� ���� ����)
	private String userID;
	private String AduserID;
	
	public Boolean isAnswered(int QPostNum) {
		return false;
	}
}
