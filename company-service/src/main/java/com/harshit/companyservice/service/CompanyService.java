package com.harshit.companyservice.service;

import java.util.List;

import com.harshit.companyservice.dto.CompanyDto;

public interface CompanyService {
	
	public Iterable<CompanyDto> getAllCompanies();
	public CompanyDto addCompany(CompanyDto companyDto);
	public void deleteCompany(Integer Id);
	public CompanyDto updateCompany(CompanyDto companyDto, Integer companyId);
	public List<CompanyDto> searchByPattern(String pattern);
	public List<CompanyDto> searchSectorCompanies(Integer sector);
	public List<CompanyDto> searchStockCompanies(String stockExchange);
	

}
