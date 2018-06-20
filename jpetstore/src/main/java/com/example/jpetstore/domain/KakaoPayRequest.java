package com.example.jpetstore.domain;

public class KakaoPayRequest {
	private String cid;
	private String tid;
	private String pg_token;
	private String partner_order_id;
	private String partner_user_id;
	private String item_name;
	private String item_code;
	private int quantity;
	private int total_amount;
	private int tax_free_amount;
	private int vat_amount;
	private String approval_url;
	private String cancel_url;
	private String fail_url;
	private String agent;
	
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
	public String getPg_token() {
		return pg_token;
	}
	public void setPg_token(String pg_token) {
		this.pg_token = pg_token;
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
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public int getTax_free_amount() {
		return tax_free_amount;
	}
	public void setTax_free_amount(int tax_free_amount) {
		this.tax_free_amount = tax_free_amount;
	}
	public int getVat_amount() {
		return vat_amount;
	}
	public void setVat_amount(int vat_amount) {
		this.vat_amount = vat_amount;
	}
	public String getApproval_url() {
		return approval_url;
	}
	public void setApproval_url(String approval_url) {
		this.approval_url = approval_url;
	}
	public String getCancel_url() {
		return cancel_url;
	}
	public void setCancel_url(String cancel_url) {
		this.cancel_url = cancel_url;
	}
	public String getFail_url() {
		return fail_url;
	}
	public void setFail_url(String fail_url) {
		this.fail_url = fail_url;
	}
	@Override
	public String toString() {
		return "cid=" + cid + "&tid=" + tid + "&pg_token=" + pg_token + "&partner_order_id="
				+ partner_order_id + "&partner_user_id=" + partner_user_id + "&item_name=" + item_name
				+ "&item_code=" + item_code + "&quantity=" + quantity + "&total_amount=" + total_amount
				+ "&tax_free_amount=" + tax_free_amount + "&vat_amount=" + vat_amount + "&approval_url="
				+ approval_url + "&cancel_url=" + cancel_url + "&fail_url=" + fail_url;
	}
	
	
	
}