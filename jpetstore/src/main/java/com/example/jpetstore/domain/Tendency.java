package com.example.jpetstore.domain;

import java.util.HashMap;
import java.util.Map;

public class Tendency {//���� �׽�Ʈ�� ���� domain class

	private Map<Integer, Boolean> testResult = new HashMap<Integer, Boolean>(); 
	//ȸ���� �׽�Ʈ ����� map ���·� �޾ƿ´�. integer�� �׽�Ʈ ��ȣ, boolean�� ȸ���� �亯��� (T/F)
	private Account account;//������ ȸ���� ���̵�
	private Map<Integer, Boolean> bird = new HashMap<Integer, Boolean>(); 
	//�����ڰ� ������ bird ������ �̻����� �亯 (70% �̻��̸� �ش� �������� ����)-> map���� �ش� �׽�Ʈ ��ȣ�� ����� ���Ѵ�. 
	private Map<Integer, Boolean> dog = new HashMap<Integer, Boolean>();
	//�����ڰ� ������ dog ������ �̻����� �亯 (70% �̻��̸� �ش� �������� ����)
	private Map<Integer, Boolean> cat = new HashMap<Integer, Boolean>();
	//�����ڰ� ������ cat ������ �̻����� �亯 (70% �̻��̸� �ش� �������� ����)
	private Map<Integer, Boolean> reptiles = new HashMap<Integer, Boolean>();
	//�����ڰ� ������ reptiles ������ �̻����� �亯 (70% �̻��̸� �ش� �������� ����)
	private Map<Integer, Boolean> fish = new HashMap<Integer, Boolean>();
	//�����ڰ� ������ fish ������ �̻����� �亯 (70% �̻��̸� �ش� �������� ����)
	private String tendecyResult; //�ش� ȸ���� ����� ���� 

	public String compareTestResult(Map<Integer, Boolean> userResult) {
		
	}
}
