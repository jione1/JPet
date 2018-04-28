package com.example.jpetstore.service;

import com.example.jpetstore.domain.Q_A;
import com.example.jpetstore.dao.QADao;

public class QAServiceImpl implements QAService {

	@Autowired
	private QADao qaDao;
	
	@Override
	public void updateQA(int qaNum, String answer, String sellerId) {
		// TODO Auto-generated method stub
		qaDao.updateQAPost(qaNum, answer, sellerId);
	}

	@Override
	public void deleteQA(int qaNum) {
		// TODO Auto-generated method stub
		qaDao.deleteQAPost(qaNum);
	}

	@Override
	public void insertQA(Q_A qa) {
		// TODO Auto-generated method stub
		qaDao.insertQAPost(qa);
	}

	@Override
	public void updateQA(Q_A qa) {
		// TODO Auto-generated method stub
		qaDao.updateQAPost(qa);
	}

	@Override
	public Q_A getQA(int itemId) {
		// TODO Auto-generated method stub
		return qaDao.getQA(itemId);
	}

	@Override
	public Q_A getQA(String adId) {
		// TODO Auto-generated method stub
		return qaDao.getQA(adId);
	}

}