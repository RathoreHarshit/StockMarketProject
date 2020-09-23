package com.harshit.uploadexcelservice.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.harshit.uploadexcelservice.model.StockPrice;
import com.harshit.uploadexcelservice.repo.StockPriceDao;

@Service
@Transactional
public class StockPriceServiceImpl implements StockPriceService {
	
	private StockPriceDao stockPriceDao;
	
	public StockPriceServiceImpl(StockPriceDao stockPriceDao) {
		this.stockPriceDao = stockPriceDao;
	}

	@Override
	public List<StockPrice> addStockPriceData(List<StockPrice> stockPrices) {
		
		for(StockPrice stockPrice:stockPrices ) {
			stockPriceDao.save(stockPrice);
		}
		
		return stockPrices;
	}

	@Override
	public List<StockPrice> findAllByDateBetween(Date date1,Date date2) {
		return stockPriceDao.findAllByDateBetween(date1, date2);
	}

	@Override
	public List<StockPrice> findAllByCompanyId(int companyId) {
		return stockPriceDao.findAllByCompanyId(companyId);
	}

	@Override
	public List<StockPrice> findAllByStockExchange(String stockExchange) {
		return stockPriceDao.findAllByStockExchange(stockExchange);
	}
	
}
