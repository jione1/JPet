package com.example.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpetstore.dao.P2PDao;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.dao.mybatis.mapper.P2PMapper;

@Repository
public class MybatisP2PDao implements P2PDao{
	
	@Autowired
	private P2PMapper p2pMapper;
	
	@Override
	public void insertPost(P2P p2p) {
		// TODO Auto-generated method stub
		p2pMapper.insertPost(p2p);
	}

	@Override
	public P2P getP2PDetail(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void updatePost(P2P p2p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<P2P> getP2PPostList(String userId) {
		// TODO Auto-generated method stub
		return p2pMapper.getP2PPostList(userId);
	}
	@Override
	public List<P2P> getP2PList() {
		// TODO Auto-generated method stub
		return p2pMapper.getP2PList();
	}
	
	@Override
	public P2P getP2PSeller(String itemId) {
		return p2pMapper.getP2PSeller(itemId);
	}
}
