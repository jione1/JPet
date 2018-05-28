package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.P2P;

public interface P2PMapper {
	void insertPost(P2P p2p);
	List<P2P> getP2PPostList(String userId); //post ���� ����Ʈ�� ������ �� ���
	P2P getP2PDetail(String itemId);
}
