package com.example.jpetstore.domain;

public class Auction {
	//��� item�� ����

	 private int acuNum;
	 private int itemId; //�ֹ��� ���� itemID�� �ο�
	 private int MaxPrice; //��Ÿ� ���� �ο��Ǵ� �ְ���
	 private int inputPrice; //�����ڵ��� �ø��� ���� ����
	 private String userId; //�����ϴ� �����ڵ��� id
	 private boolean aucStatus; //���� ����
	 private String itemName; //��ſ� �÷����� item�� �̸� 
	 private String discription; //��ſ� �÷����� item�� ����
	 private int unitCost; //�Ǹ��ڰ� �ø��� ���� ���� (��������)

	 public Boolean isSold(int itemId) {
		 return false;
	 }
	 
}
