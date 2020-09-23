package com.harshit.companyservice.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.companyservice.dto.CompanyDto;
import com.harshit.companyservice.service.CompanyService;

@RestController
@Transactional
public class CompanyController {
	
	private CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}
	

	@GetMapping("/companies")
	public ResponseEntity<Iterable<CompanyDto>> getCompanyDetails(){
		
		return new ResponseEntity<Iterable<CompanyDto>>(companyService.getAllCompanies(), HttpStatus.OK); 
	}
	
	@PostMapping("/companies")
	public ResponseEntity<CompanyDto> addCompany(@RequestBody CompanyDto companyDto) {
		return new ResponseEntity<CompanyDto>(companyService.addCompany(companyDto), HttpStatus.CREATED);
	}
	
	@PutMapping("/companies/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto companyDto,@PathVariable("companyId") Integer companyId){
		return new ResponseEntity<CompanyDto> (companyService.updateCompany(companyDto,companyId), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/companies/{companyId}")
	public ResponseEntity<String> deleteCompany(@PathVariable("companyId") Integer companyId){
		
		companyService.deleteCompany(companyId);
		return new ResponseEntity<String>("Successfully Deleted!!!", HttpStatus.OK);
		
	}
	
	@GetMapping("/companies/findByPattern/{pattern}")
	public ResponseEntity<List<CompanyDto>> searchCompany(@PathVariable("pattern") String pattern)
	{
		return new ResponseEntity<List<CompanyDto>> (companyService.searchByPattern(pattern), HttpStatus.OK);
	}


	@GetMapping("/companiesOfSector/{sectorId}")
	public List<CompanyDto> seacrhSectorCompanies(@PathVariable("sectorId") Integer sector){
		
		return companyService.searchSectorCompanies(sector);
	}
	
	@GetMapping("/companiesOfStock/{stockExchange}")
	public List<CompanyDto> searchStockCompanies(@PathVariable("stockExchange") String stockExchange ){
		return companyService.searchStockCompanies(stockExchange);
	}
}
