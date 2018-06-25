package com.example.jpetstore.controller;

import java.io.Serializable;

import javax.validation.constraints.Min;
<<<<<<< HEAD
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
=======
>>>>>>> origin/auctionOk

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
public class P2PForm implements Serializable{
	//product�� name���� �з��ؾ���. 
	
	@NotEmpty
	private String itemName; //product-name ���� �־���Ѵ�.
	
	private String sort; // auction / p2p 
	private String category;//������ product -categoryId 
	
	@Min(1)
	private int quantity; //�ǸŰ��ɷ� (item-quantity ->db �߰�)
	
	@Min(100)
	private int price; //�ǸŰ��� (item - listprice)
	
	private MultipartFile report; //item ���� (item-itemImage)
	private String discription; //�Խñ� �󼼳��� (item attr1)
	
	@NotEmpty
	private String title; //p2p �Խñ� ���� 
	private int supplier; //������=1 / �Ϲ��Ǹ���=2 
	private String itemId;
	private String productId;
	
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
	
	public MultipartFile getReport() {
		return report;
	}
	public void setReport(MultipartFile report) {
		this.report = report;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSupplier() {
		return supplier;
	}
	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	

	
}