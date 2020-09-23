package com.harshit.userdashboard.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("stock-ws")
public interface StockexchangeClient {
	
	@GetMapping("/stocks")
	public ResponseEntity<List<StockDto>> getAllStockInfo();
	
	@GetMapping("/stocks/{stockId}")
	public ResponseEntity<StockDto> getStockById(@PathVariable("stockId") Integer stockId) ;
	
	@GetMapping("/stocks/{stockExchange}/companies")
	public ResponseEntity<List<CompanyDto>> stockCompanies(@PathVariable("stockExchange") String stockExchange);
	
}