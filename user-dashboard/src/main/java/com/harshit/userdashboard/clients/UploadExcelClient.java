package com.harshit.userdashboard.clients;

import java.util.Date;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("upload-ws")
public interface UploadExcelClient {
	
	@GetMapping("/filterbyDate/{date1}/{date2}")
	public ResponseEntity<List<StockPrice>> findAllByDateBetween(@PathVariable Date date1,@PathVariable Date date2) ;
		
	@GetMapping("/filterbyCompanyId/{companyId}")
	public ResponseEntity<List<StockPrice>> findAllByCompanyId(@PathVariable int companyId) ;
	
	@GetMapping("/filterbyStockExchange/{stockExchange}")
	public ResponseEntity<List<StockPrice>>  findAllByStockExchange(@PathVariable String stockExchange) ;
		
}