package com.example.jpetstore.service;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.P2P;
import com.example.jpetstore.dao.P2PDao;
import com.example.jpetstore.dao.ItemDao;

public class P2PServiceImpl implements P2PService {

	@Autowired
	private P2PDao p2pDao;
	
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public void deleteItem(int postNum) {
		// TODO Auto-generated method stub
		p2pDao.deletePost(postNum);
	}

	@Override
	public void insertItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.insertItem(item);
	}

	@Override
	public void insertP2P(P2P p2p) {
		// TODO Auto-generated method stub
		p2pDao.insertPost(p2p);
	}

	@Override
	public List<P2P> getP2PList(String userId) {
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
		p2pDao.updatePost(p2p);
	}

}