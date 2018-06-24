package com.example.jpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpetstore.dao.AccountDao;
import com.example.jpetstore.domain.Account;

@Service
public class KakaoLoginImpl implements KakaoLoginService {
	@Autowired	// @Qualifier("mybatisAccountDao")
	private AccountDao accountDao;
	
	public void kakaoLogin(Account account) {
		accountDao.kakaoLogin(account);
	}
}