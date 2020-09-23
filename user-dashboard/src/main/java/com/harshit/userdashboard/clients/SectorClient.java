package com.harshit.userdashboard.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("sector-ws")
public interface SectorClient {
	
	@GetMapping("/sectors")
	public ResponseEntity<List<SectorDto>> getAllSectors();
	
	@GetMapping("/sectors/{sectorId}")
	public ResponseEntity<SectorDto> getSectorById(@PathVariable("sectorId") Integer sectorId);
		
	@GetMapping("/sectors/{sectorId}/companies")
	public ResponseEntity<List<CompanyDto>> sectorCompanies(@PathVariable("sectorId") Integer sectorId);

}
