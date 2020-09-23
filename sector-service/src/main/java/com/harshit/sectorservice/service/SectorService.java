package com.harshit.sectorservice.service;

import java.util.List;
//import java.util.Optional;

import com.harshit.sectorservice.dto.SectorDto;

public interface SectorService {
	
	public SectorDto getSectorById(Integer id);
	public List<SectorDto> getAllSectors();
	public SectorDto createSector(SectorDto sectorDto);
	
}
