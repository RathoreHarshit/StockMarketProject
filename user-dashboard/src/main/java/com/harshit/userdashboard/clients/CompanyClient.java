package com.harshit.userdashboard.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("company-ws")
public interface CompanyClient {
	
	@GetMapping("/companies")
	public ResponseEntity<Iterable<CompanyDto>> getCompanyDetails();
		
	@GetMapping("/companies/findByPattern/{pattern}")
	public ResponseEntity<List<CompanyDto>> searchCompany(@PathVariable("pattern") String pattern);
	
	@GetMapping("/ipoDetails/{companyName}")
	public ResponseEntity<List<IpoDetail>> getIpoDetails(@PathVariable("companyName") String companyName);
	
}