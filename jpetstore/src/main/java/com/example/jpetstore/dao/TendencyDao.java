package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Tendency;

public interface TendencyDao {
	void insertResult(Tendency result);
	void updateResult(Tendency result);
	String getTendencyResult(String userId);
	
}
