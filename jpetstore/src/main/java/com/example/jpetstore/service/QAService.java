package com.example.jpetstore.service;

import com.example.jpetstore.domain.Q_A;

public interface QAService {
	//�����ϱ� 

	void insertQA(Q_A qa);
	//����ڰ� �ۼ��� ���Ǳ��� �����Ѵ�. 

	void updateQA(Q_A qa);
	//����ڰ� ���Ǳ��� �����Ͽ��� �� ���

	void updateQA(int qaNum, String answer, String sellerId);
	//�����ڳ� �Ǹ��ڰ� �亯�� �޾��� �� ���

	void deleteQA(int qnum);
	//����ڰ� ���Ǳ��� ������ �� ���

	List<Q_A> getQAList();
	//���Ǳ� ���θ� �ҷ��� �� ���

	Q_A getQA(int itemId);
	//�Ǹ����� item�� ���� ���Ǳ��� ������ �� ���

	Q_A getQA(String adId);
	//�����ڿ��� �ۼ��� ���Ǳ��� ������ �� ��
}
