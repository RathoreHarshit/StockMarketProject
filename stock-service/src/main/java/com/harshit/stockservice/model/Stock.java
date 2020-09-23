package com.harshit.stockservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer stockId;
	private String StockExchange;
	private String breif;
	private String contactAddress;
	private String Remarks;

	public Stock() {
	}

	public Stock(Integer id, Integer stockId, String stockExchange, String breif, String contactAddress,
			String remarks) {
		super();
		this.id = id;
		this.stockId = stockId;
		StockExchange = stockExchange;
		this.breif = breif;
		this.contactAddress = contactAddress;
		Remarks = remarks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
