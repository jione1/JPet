package com.example.jpetstore.service;

import com.example.jpetstore.dao.TendencyDao;
import com.example.jpetstore.domain.Tendency;


public class TendencyServiceImpl implements TendencyService {
	
	@Autowired
	private TendencyDao tendencyDao;
	
	@Override
	public String getTendencyResult(String userId) {
		// TODO Auto-generated method stub
		return tendencyDao.getTendencyResult(userId);
	}

	@Override
	public void insertTendencyResult(Tendency tendency) {
		// TODO Auto-generated method stub
		tendencyDao.insertResult(tendency);
	}

	@Override
	public void updateTendency(Tendency tendency) {
		// TODO Auto-generated method stub
		tendencyDao.updateResult(tendency);
	}

}