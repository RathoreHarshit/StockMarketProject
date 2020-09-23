package com.harshit.stockservice.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.stockservice.client.CompanyClient;
import com.harshit.stockservice.client.CompanyDto;
import com.harshit.stockservice.dto.StockDto;
import com.harshit.stockservice.service.StockService;

@RestController
@Transactional
public class StockController {

	private StockService stockService;
	private CompanyClient companyClient;

	

	public StockController(StockService stockService, CompanyClient companyClient) {
		this.stockService = stockService;
		this.companyClient = companyClient;
	}

	@GetMapping("/stocks")
	public ResponseEntity<List<StockDto>> getAllStockInfo() {
		return new ResponseEntity<List<StockDto>>(stockService.getAllStocks(), HttpStatus.OK);

	}

	@GetMapping("/stocks/{stockId}")
	public ResponseEntity<StockDto> getStockById(@PathVariable("stockId") Integer stockId) {
		return new ResponseEntity<StockDto>(stockService.getStockById(stockId), HttpStatus.OK);
	}

	@PostMapping("/stocks")
	public ResponseEntity<StockDto> addStock(@RequestBody StockDto stockDto) {
		return new ResponseEntity<StockDto>(stockService.createStock(stockDto), HttpStatus.CREATED);

	}
	
	@GetMapping("/stocks/{stockExchange}/companies")
	public ResponseEntity<List<CompanyDto>> stockCompanies(@PathVariable("stockExchange") String stockExchange){
		return new ResponseEntity<List<CompanyDto>> (companyClient.findStockCompanies(stockExchange),HttpStatus.OK );
	}
	
	
}