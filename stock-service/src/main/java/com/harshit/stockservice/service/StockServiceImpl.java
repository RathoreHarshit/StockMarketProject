package com.harshit.stockservice.service;

import java.lang.reflect.Type;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.harshit.stockservice.dao.StockDao;
import com.harshit.stockservice.dto.StockDto;
import com.harshit.stockservice.model.Stock;

@Service
@Transactional
public class StockServiceImpl implements StockService {

	private StockDao stockDao;
	private ModelMapper modelMapper;

	public StockServiceImpl(StockDao stockDao, ModelMapper modelMapper) {
		super();
		this.stockDao = stockDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public StockDto getStockById(Integer stockId) {
		Stock stock = stockDao.findByStockId(stockId);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(stock, StockDto.class);
	}

	@Override
	public List<StockDto> getAllStocks() {
	
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Type listType = new TypeToken<List<StockDto>>(){}.getType();
		List<StockDto> postDtoList = modelMapper.map(stockDao.findAll(), listType);
		return postDtoList;
	}

	@Override
	public StockDto createStock(StockDto stockDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Stock stock = stockDao.save(modelMapper.map(stockDto, Stock.class));
		return modelMapper.map(stock, StockDto.class);
	}





}
