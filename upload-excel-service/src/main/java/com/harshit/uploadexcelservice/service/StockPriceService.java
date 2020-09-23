package com.harshit.uploadexcelservice.service;

import java.util.Date;
import java.util.List;

import com.harshit.uploadexcelservice.model.StockPrice;

public interface StockPriceService {
	
	public List<StockPrice> addStockPriceData(List<StockPrice> stockPrices);
	public List<StockPrice> findAllByDateBetween(Date date1, Date date2);
	public List<StockPrice> findAllByCompanyId(int companyId);
	public List<StockPrice> findAllByStockExchange(String stockExchange);
}
