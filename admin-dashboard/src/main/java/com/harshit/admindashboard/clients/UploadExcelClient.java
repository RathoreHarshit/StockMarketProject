package com.harshit.admindashboard.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient("upload-ws")
public interface UploadExcelClient {
	
	@PostMapping("/importStockPriceDetails")
	public ResponseEntity<List<StockPrice>> addDataFromCsvToDb(@RequestParam("file") MultipartFile stockDataFile);
		
}