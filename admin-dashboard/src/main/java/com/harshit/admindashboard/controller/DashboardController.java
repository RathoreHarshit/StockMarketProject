
package com.harshit.admindashboard.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.harshit.admindashboard.clients.CompanyClient;
import com.harshit.admindashboard.clients.CompanyDto;
import com.harshit.admindashboard.clients.IpoDetail;
import com.harshit.admindashboard.clients.StockDto;
import com.harshit.admindashboard.clients.StockPrice;
import com.harshit.admindashboard.clients.StockexchangeClient;
import com.harshit.admindashboard.clients.UploadExcelClient;

@RestController
public class DashboardController {
	
	CompanyClient companyClient;
	StockexchangeClient stockClient;
	UploadExcelClient uploadClient;
	
	public DashboardController(CompanyClient companyClient, StockexchangeClient stockClient,
			UploadExcelClient uploadClient) {
		super();
		this.companyClient = companyClient;
		this.stockClient = stockClient;
		this.uploadClient = uploadClient;
	}

	

	@PostMapping("/addCompany")
	public ResponseEntity<CompanyDto> addCompany(@RequestBody CompanyDto companyDto){
		return companyClient.addCompany(companyDto);
	}
		
	@PutMapping("/updateCompany/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto companyDto,@PathVariable("companyId") Integer companyId){
		return companyClient.updateCompany(companyDto,companyId);
	}
	
	@DeleteMapping("/deleteCompany/{companyId}")
	public ResponseEntity<String> deleteCompany(@PathVariable("companyId") Integer companyId){
		return companyClient.deleteCompany(companyId);
	}

	@PostMapping("/addIpo")
	public ResponseEntity<IpoDetail> addIpoDetail(@RequestBody IpoDetail ipoDetail){
		return companyClient.addIpoDetail(ipoDetail);
	}
	
	@GetMapping("/stockExchanges")
	public ResponseEntity<List<StockDto>> getAllStockInfo(){
		return stockClient.getAllStockInfo();
	}
	
	@PostMapping("/addStockExchange")
	public ResponseEntity<StockDto> addStock(@RequestBody StockDto stockDto){
		return stockClient.addStock(stockDto);
	}
	
	@PostMapping("/importStockPriceDetails")
	public ResponseEntity<List<StockPrice>> addDataFromCsvToDb(@RequestParam("file") MultipartFile stockDataFile){
		return uploadClient.addDataFromCsvToDb(stockDataFile);
	}
}
