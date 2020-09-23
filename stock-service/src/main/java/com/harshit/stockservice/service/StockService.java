package com.harshit.stockservice.service;

import java.util.List;

import com.harshit.stockservice.dto.StockDto;

public interface StockService {
	public StockDto getStockById(Integer stockId);
	public List<StockDto> getAllStocks();
	public StockDto createStock(StockDto stockDto);
	
}
