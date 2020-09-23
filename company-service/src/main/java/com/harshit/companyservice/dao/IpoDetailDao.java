package com.harshit.companyservice.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.companyservice.model.IpoDetail;

@Repository
public interface IpoDetailDao extends JpaRepository<IpoDetail, Integer>{
	
	List<IpoDetail> findByCompanyName(String companyName); 

}
