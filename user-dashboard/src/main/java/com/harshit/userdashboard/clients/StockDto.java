package com.harshit.userdashboard.clients;

public class StockDto {
	private Integer stockId;
	private String StockExchange;
	private String breif;
	private String contactAddress;
	private String Remarks;

	public StockDto() {
	}

	public StockDto(Integer stockId, String stockExchange, String breif, String contactAddress, String remarks) {
		super();
		this.stockId = stockId;
		StockExchange = stockExchange;
		this.breif = breif;
		this.contactAddress = contactAddress;
		Remarks = remarks;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}

	public String getBreif() {
		return breif;
	}

	public void setBreif(String breif) {
		this.breif = breif;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

}
