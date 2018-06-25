package com.example.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.QADao;
import com.example.jpetstore.dao.mybatis.mapper.QAMapper;
import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.QA;

@Repository
public class MybatisQADao implements QADao {
	
	@Autowired
	private QAMapper qaMapper;

	@Override
	public void insertQAPost(QA qa) {
		// TODO Auto-generated method stub
		qaMapper.insertQAPost(qa);
	}
	public void insertQASellerPost(QA qa) {
		qaMapper.insertQASellerPost(qa);
	}

	@Override
	public void deleteQAPost(int qnum) {
		// TODO Auto-generated method stub
		qaMapper.deleteQAPost(qnum);
	}

	@Override
	public void updateQAPost(QA qa) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<QA> getQAList() {
		// TODO Auto-generated method stub
		return qaMapper.getQAList();
	}

	@Override
	public QA getQA(int qaNum) {
		// TODO Auto-generated method stub
		return qaMapper.getQA(qaNum);
	}
	
	@Override
	public void insertQAReply(QA qa) {
		qaMapper.insertQAReply(qa);
	}

}
