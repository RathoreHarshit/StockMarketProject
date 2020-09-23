package com.harshit.admindashboard.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("stock-ws")
public interface StockexchangeClient {
	
	@GetMapping("/stocks")
	public ResponseEntity<List<StockDto>> getAllStockInfo();
	
	@PostMapping("/stocks")
	public ResponseEntity<StockDto> addStock(@RequestBody StockDto stockDto);
		
}