package com.harshit.sectorservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.sectorservice.model.Sector;

@Repository
public interface SectorDao extends JpaRepository<Sector, Integer> {
	
	Sector findBySectorId(Integer id);

}
