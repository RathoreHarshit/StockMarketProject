package com.harshit.stockservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("company-ws")
public interface CompanyClient {
	@GetMapping("/companiesOfStock/{stockExchange}")
	public List<CompanyDto> findStockCompanies(@PathVariable("stockExchange") String stockExchange);

}
