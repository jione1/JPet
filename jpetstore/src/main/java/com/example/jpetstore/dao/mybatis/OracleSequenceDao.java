package com.example.jpetstore.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.mybatis.mapper.SequenceMapper;
import com.example.jpetstore.domain.Sequence;
@Repository
public class OracleSequenceDao extends MybatisSequenceDao {

	/**
	 * Get the next sequence using an Oracle thread-safe sequence
	 * @param name Name is the name of the oracle sequence.
	 * @return the next sequence
	 */
	@Autowired
	private SequenceMapper sequenceMapper;
	
	public int getSequence(String name) throws DataAccessException {
		Sequence sequence = new Sequence();
		sequence.setName(name);
		sequence = sequenceMapper.getSequence(sequence);
		
		return sequence.getNextId();
	}
	
	public void updateSequence(String name) throws DataAccessException {
		Sequence sequence = new Sequence();
		sequence.setName(name);
		sequenceMapper.updateSequence(sequence);
		
	}

	public int getNextId(String name) throws DataAccessException {
		Sequence sequence = new Sequence();
		sequence.setName(name);
		sequence = sequenceMapper.getOracleSequence(sequence);
		return sequence.getNextId();
	}
}
