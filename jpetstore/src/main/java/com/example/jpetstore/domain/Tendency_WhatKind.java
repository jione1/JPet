package com.example.jpetstore.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tendency_WhatKind implements InitializingBean, DisposableBean {
	//tendency.properties의 데이터를 저장할 변수 
	
	private String[] kind;

	public String[] getKind() {
		return kind;
	}
	public void setKind(String[] kind) {
		this.kind = kind;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}
}
