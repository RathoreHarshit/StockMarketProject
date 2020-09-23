package com.harshit.uploadexcelservice.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.uploadexcelservice.model.StockPrice;

@Repository
public interface StockPriceDao extends JpaRepository<StockPrice, Integer> {

	public List<StockPrice> findAllByDateBetween(Date date1, Date date2);
	public List<StockPrice> findAllByCompanyId(int companyId);
	public List<StockPrice> findAllByStockExchange(String stockExchange);
}
