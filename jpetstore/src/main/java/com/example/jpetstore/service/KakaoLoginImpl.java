package com.example.jpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.jpetstore.dao.AccountDao;
import com.example.jpetstore.domain.Account;


public class KakaoLoginImpl implements KakaoLoginService {
	@Autowired	// @Qualifier("mybatisAccountDao")
	private AccountDao accountDao;
	

	public void kakaoLogin(Account account) {
		System.out.println("tjqltm" + account.getUsername());
		accountDao.kakaoLogin(account);
	}
	
	
}
