package com.example.jpetstore.domain;

import java.util.Date;

public class KakaoPayResponse {
	private String aid;
	private String cid;
	private String tid;
	private String sid;
	private String partner_order_id;
	private String partner_user_id;
	private String payment_method_type;
//	private Amount amount;
//	private CardInfo card_info;
	private String item_name;
	private String itme_code;
	private int quantity;
	private Date approved_at;
	private String pay_load;
	private String next_redirect_app_url;
	private String next_redirect_mobile_url;
	private String next_redirect_pc_url;
	private String android_app_scheme;
	private String ios_app_scheme;
	private Date created_at;
	private String msg;
	private boolean tms_result;
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getPartner_order_id() {
		return partner_order_id;
	}
	public void setPartner_order_id(String partner_order_id) {
		this.partner_order_id = partner_order_id;
	}
	public String getPartner_user_id() {
		return partner_user_id;
	}
	public void setPartner_user_id(String partner_user_id) {
		this.partner_user_id = partner_user_id;
	}
	public String getPayment_method_type() {
		return payment_method_type;
	}
	public void setPayment_method_type(String payment_method_type) {
		this.payment_method_type = payment_method_type;
	}
//	public Amount getAmount() {
//		return amount;
//	}
//	public void setAmount(Amount amount) {
//		this.amount = amount;
//	}
//	public CardInfo getCard_info() {
//		return card_info;
//	}
//	public void setCard_info(CardInfo card_info) {
//		this.card_info = card_info;
//	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItme_code() {
		return itme_code;
	}
	public void setItme_code(String itme_code) {
		this.itme_code = itme_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getApproved_at() {
		return approved_at;
	}
	public void setApproved_at(Date approved_at) {
		this.approved_at = approved_at;
	}
	public String getPay_load() {
		return pay_load;
	}
	public void setPay_load(String pay_load) {
		this.pay_load = pay_load;
	}
	public String getNext_redirect_app_url() {
		return next_redirect_app_url;
	}
	public void setNext_redirect_app_url(String next_redirect_app_url) {
		this.next_redirect_app_url = next_redirect_app_url;
	}
	public String getNext_redirect_mobile_url() {
		return next_redirect_mobile_url;
	}
	public void setNext_redirect_mobile_url(String next_redirect_mobile_url) {
		this.next_redirect_mobile_url = next_redirect_mobile_url;
	}
	public String getNext_redirect_pc_url() {
		return next_redirect_pc_url;
	}
	public void setNext_redirect_pc_url(String next_redirect_pc_url) {
		this.next_redirect_pc_url = next_redirect_pc_url;
	}
	public String getAndroid_app_scheme() {
		return android_app_scheme;
	}
	public void setAndroid_app_scheme(String android_app_scheme) {
		this.android_app_scheme = android_app_scheme;
	}
	public String getIos_app_scheme() {
		return ios_app_scheme;
	}
	public void setIos_app_scheme(String ios_app_scheme) {
		this.ios_app_scheme = ios_app_scheme;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date create_at) {
		this.created_at = create_at;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isTms_result() {
		return tms_result;
	}
	public void setTms_result(boolean tms_result) {
		this.tms_result = tms_result;
	}
	@Override
	public String toString() {
		return "KakaoPayResponse [aid=" + aid + ", cid=" + cid + ", tid=" + tid + ", sid=" + sid + ", partner_order_id="
				+ partner_order_id + ", partner_user_id=" + partner_user_id + ", payment_method_type="
				+ payment_method_type + ", item_name=" + item_name
				+ ", itme_code=" + itme_code + ", quantity=" + quantity + ", approved_at=" + approved_at + ", pay_load="
				+ pay_load + ", next_redirect_app_url=" + next_redirect_app_url + ", next_redirect_mobile_url="
				+ next_redirect_mobile_url + ", next_redirect_pc_url=" + next_redirect_pc_url + ", android_app_scheme="
				+ android_app_scheme + ", ios_app_scheme=" + ios_app_scheme + ", created_at=" + created_at + ", msg="
				+ msg + "]";
	}
}