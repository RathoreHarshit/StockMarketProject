package com.harshit.sectorservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("company-ws")
public interface CompanyClient {
	
	@GetMapping("/companiesOfSector/{sectorId}")
	public List<CompanyDto> findSectorCompanies(@PathVariable("sectorId") Integer sectorId);

}
