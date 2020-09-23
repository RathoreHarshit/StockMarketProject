package com.harshit.companyservice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.companyservice.model.Company;


@Repository
public interface CompanyDao extends JpaRepository<Company, Integer>{

	Optional<Company> findByCompanyId(Integer companyId);
	List<Company> findByCompanyNameContaining(String pattern);
	List<Company> findBySector(Integer sectorId);
	List<Company> findByStockExchanges(String stockExchange);

}
