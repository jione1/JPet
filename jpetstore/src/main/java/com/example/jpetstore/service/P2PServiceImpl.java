package com.example.jpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.dao.P2PDao;
import com.example.jpetstore.dao.ItemDao;
import java.util.List;

@Service

public class P2PServiceImpl implements P2PService {

	@Autowired
	private P2PDao p2pDao;
	
	@Autowired
	private ItemDao itemDao;

	@Override
	public void insertItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.insertItem(item);
	}

	@Override
	public P2P getP2PDetail(String itemId) {
		// TODO Auto-generated method stub
		return p2pDao.getP2PDetail(itemId);
	}

	@Override
	public void insertP2P(P2P p2p) {
		// TODO Auto-generated method stub
		p2pDao.insertPost(p2p);
	}

	@Override
	public List<P2P> getP2PPostList(String userId) {
		// TODO Auto-generated method stub
		return p2pDao.getP2PPostList(userId);
	}

	@Override
	public Item getItem(String itemId, String userId) {
		// TODO Auto-generated method stub
		return itemDao.getItem(itemId, userId); 
	}

	@Override
	public void updateP2P(P2P p2p) {
		// TODO Auto-generated method stub
		p2pDao.updateP2P(p2p);
	}
	@Override
	public List<P2P> getP2PList() {
		return p2pDao.getP2PList();
	}
	@Override
	public P2P getP2PSeller(String itemId) {
		return p2pDao.getP2PSeller(itemId);
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/auctionOk
