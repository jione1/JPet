package com.example.jpetstore.dao;

import org.springframework.dao.DataAccessException;

public interface SequenceDao {
	public int getNextId(String name) throws DataAccessException;
	public int getSequence(String name) throws DataAccessException;
	public void updateSequence(String name) throws DataAccessException;
}