
package com.harshit.userdashboard.controller;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.userdashboard.clients.CompanyClient;
import com.harshit.userdashboard.clients.CompanyDto;
import com.harshit.userdashboard.clients.IpoDetail;
import com.harshit.userdashboard.clients.SectorClient;
import com.harshit.userdashboard.clients.SectorDto;
import com.harshit.userdashboard.clients.StockDto;
import com.harshit.userdashboard.clients.StockPrice;
import com.harshit.userdashboard.clients.StockexchangeClient;
import com.harshit.userdashboard.clients.UploadExcelClient;

@RestController
public class DashboardController {
	
	CompanyClient companyClient;
	StockexchangeClient stockClient;
	UploadExcelClient uploadClient;
	SectorClient sectorClient;
	
	public DashboardController(CompanyClient companyClient, StockexchangeClient stockClient,
			UploadExcelClient uploadClient,SectorClient sectorClient) {
		super();
		this.companyClient = companyClient;
		this.stockClient = stockClient;
		this.uploadClient = uploadClient;
		this.sectorClient=sectorClient;
	}

	@GetMapping("/companies")
	public ResponseEntity<Iterable<CompanyDto>> getCompanyDetails(){
		return companyClient.getCompanyDetails();
	}
		
	@GetMapping("/companies/findByPattern/{pattern}")
	public ResponseEntity<List<CompanyDto>> searchCompany(@PathVariable("pattern") String pattern){
		return companyClient.searchCompany(pattern);
	}
	
	@GetMapping("/ipoDetails/{companyName}")
	public ResponseEntity<List<IpoDetail>> getIpoDetails(@PathVariable("companyName") String companyName){
		return companyClient.getIpoDetails(companyName);
	}
	

	@GetMapping("/sectors")
	public ResponseEntity<List<SectorDto>> getAllSectors(){
		return sectorClient.getAllSectors();
	}
	
	@GetMapping("/sectors/{sectorId}")
	public ResponseEntity<SectorDto> getSectorById(@PathVariable("sectorId") Integer sectorId){
		return sectorClient.getSectorById(sectorId);
	}
		
	@GetMapping("/sectors/{sectorId}/companies")
	public ResponseEntity<List<CompanyDto>> sectorCompanies(@PathVariable("sectorId") Integer sectorId){
		return sectorClient.sectorCompanies(sectorId);
	}
	
	@GetMapping("/stocks")
	public ResponseEntity<List<StockDto>> getAllStockInfo(){
		return stockClient.getAllStockInfo();
	}
	
	@GetMapping("/stocks/{stockId}")
	public ResponseEntity<StockDto> getStockById(@PathVariable("stockId") Integer stockId){
		return stockClient.getStockById(stockId);
	}
	
	@GetMapping("/stocks/{stockExchange}/companies")
	public ResponseEntity<List<CompanyDto>> stockCompanies(@PathVariable("stockExchange") String stockExchange){
		return stockClient.stockCompanies(stockExchange);
	}
	
	@GetMapping("/filterbyDate/{date1}/{date2}")
	public ResponseEntity<List<StockPrice>> findAllByDateBetween(@PathVariable Date date1,@PathVariable Date date2){
		return uploadClient.findAllByDateBetween(date1, date2);
	}
		
	@GetMapping("/filterbyCompanyId/{companyId}")
	public ResponseEntity<List<StockPrice>> findAllByCompanyId(@PathVariable int companyId){
		return uploadClient.findAllByCompanyId(companyId);
	}
	
	@GetMapping("/filterbyStockExchange/{stockExchange}")
	public ResponseEntity<List<StockPrice>>  findAllByStockExchange(@PathVariable String stockExchange){
		return uploadClient.findAllByStockExchange(stockExchange);
	}
}
