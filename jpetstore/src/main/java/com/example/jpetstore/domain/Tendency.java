package com.example.jpetstore.domain;

import java.util.HashMap;
import java.util.Map;

@Component
public class Tendency {//���� �׽�Ʈ�� ���� domain class

	private String[] testResult; 
	//ȸ���� �׽�Ʈ ����� map ���·� �޾ƿ´�. integer�� �׽�Ʈ ��ȣ, boolean�� ȸ���� �亯��� (T/F)
	private Account account;//������ ȸ���� ���̵�
	
	@Value("#{tendency['bird.Answer']}")
	private String[] bird; 
	//�����ڰ� ������ bird ������ �̻����� �亯�� ����� bird.properties �� ���� ���ڿ� �迭�� �޾Ƽ� ������� ���� ���Ѵ�. 
	
	@Value("#{tendency['dog.Answer']}")
	private String[] dog;
	//�����ڰ� ������ dog ������ �̻����� �亯�� ����� dog.properties �� ���� ���ڿ� �迭�� �޾Ƽ� ������� ���� ���Ѵ�. 
	
	@Value("#{tendency['cat.Answer']}")
	private String[] cat;
	//�����ڰ� ������ cat ������ �̻����� �亯�� ����� cat.properties �� ���� ���ڿ� �迭�� �޾Ƽ� ������� ���� ���Ѵ�.
	
	@Value("#{tendency['reptiles.Answer']}")
	private String[] reptiles;
	//�����ڰ� ������ reptiles ������ �̻����� �亯�� ����� reptiles.properties �� ���� ���ڿ� �迭�� �޾Ƽ� ������� ���� ���Ѵ�.
	
	
	@Value("#{tendency['reptiles.Answer']}")
	private String[] fish;
	//�����ڰ� ������ fish ������ �̻����� �亯�� ����� fish.properties �� ���� ���ڿ� �迭�� �޾Ƽ� ������� ���� ���Ѵ�.
	
	private String tendecyResult; //�ش� ȸ���� ����� ���� 

	public String compareTestResult(Map<Integer, Boolean> userResult) {
		
	}
}
