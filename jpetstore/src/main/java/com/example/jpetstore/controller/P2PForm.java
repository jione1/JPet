package com.example.jpetstore.controller;

public class P2PForm {
	//product�� name���� �з��ؾ���. 
	private String itemName; //product-name ���� �־���Ѵ�.
	private String sort; // auction / p2p 
	private String category;//������ product -categoryId 
	private int quantity; //�ǸŰ��ɷ� (item-quantity ->db �߰�)
	private int price; //�ǸŰ��� (item - listprice)
	private String file; //item ���� (item-itemImage)
	private String discription; //�Խñ� �󼼳��� (item attr1)
	private String title; //p2p �Խñ� ���� 
	private int supplier; //������=1 / �Ϲ��Ǹ���=2 
	
	public int getSupplier() {
		return supplier;
	}
	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
}
