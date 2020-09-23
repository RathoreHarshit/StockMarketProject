package com.harshit.sectorservice.service;

import java.lang.reflect.Type;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.harshit.sectorservice.dao.SectorDao;
import com.harshit.sectorservice.dto.SectorDto;
import com.harshit.sectorservice.model.Sector;

@Service
@Transactional
public class SectorServiceImpl implements SectorService {
	
	private SectorDao sectorDao;
	private ModelMapper modelMapper;
	
	public SectorServiceImpl(SectorDao sectorDao, ModelMapper modelMapper) {
		this.sectorDao = sectorDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public SectorDto getSectorById(Integer sectorId) {
		Sector sector = sectorDao.findBySectorId(sectorId);
		  modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	      return modelMapper.map(sector, SectorDto.class);
	}

	@Override
	public List<SectorDto> getAllSectors() {
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	        Type listType = new TypeToken<List<SectorDto>>(){}.getType();
	        List<SectorDto> postDtoList = modelMapper.map(sectorDao.findAll(),listType);
	        return postDtoList;
	
	}

	@Override
	public SectorDto createSector(SectorDto sectorDto) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Sector sector=sectorDao.save(modelMapper.map(sectorDto,Sector.class));
        return modelMapper.map(sector,SectorDto.class);
		
	}

}
