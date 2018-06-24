package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class P2P implements Serializable {

	private String itemId;
	private double price;
	private String title;
	private String id;
	private String url;
	Item item;
	Product product;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	//�Ǹű��� �ø� userID
	//p2p�� ȸ�翡�� ���ε� �� item��� �����ϰ� ����ϱ� ������ item�� ��ӹ޴´�.

}