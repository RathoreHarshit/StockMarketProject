package com.harshit.admindashboard.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("company-ws")
public interface CompanyClient {
	
	@PostMapping("/companies")
	public ResponseEntity<CompanyDto> addCompany(@RequestBody CompanyDto companyDto);
		
	@PutMapping("/companies/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto companyDto,@PathVariable("companyId") Integer companyId);
	
	@DeleteMapping("/companies/{companyId}")
	public ResponseEntity<String> deleteCompany(@PathVariable("companyId") Integer companyId);
	
	@PostMapping("/ipoDetails")
	public ResponseEntity<IpoDetail> addIpoDetail(@RequestBody IpoDetail ipoDetail);
}