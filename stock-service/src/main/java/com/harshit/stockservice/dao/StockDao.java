package com.harshit.stockservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.stockservice.model.Stock;

@Repository
public interface StockDao extends JpaRepository<Stock, Integer> {
	
	Stock findByStockId(Integer stockId);

}
