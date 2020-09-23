package com.harshit.admindashboard.clients;


import java.util.Date;


public class StockPrice {
	
	private Integer stockId;
	
	private int companyId;
	private String stockExchange;
	private float pricePerShare;
	private Date date;
	private String time;
	public StockPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockPrice(Integer stockId, int companyId, String stockExchange, float pricePerShare, Date date,
			String time) {
		super();
		this.stockId = stockId;
		this.companyId = companyId;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.date = date;
		this.time = time;
	}
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public float getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date2) {
		this.date = date2;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
