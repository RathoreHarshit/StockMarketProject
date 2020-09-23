package com.harshit.companyservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.harshit.companyservice.dao.IpoDetailDao;
import com.harshit.companyservice.model.IpoDetail;

@Service
@Transactional
public class IpoDetailServiceImpl implements IpoDetailService {
	
	private IpoDetailDao ipoDetailDao;
	

	public IpoDetailServiceImpl(IpoDetailDao ipoDetailDao) {
		this.ipoDetailDao = ipoDetailDao;
	}

	@Override
	public List<IpoDetail> getIpoDetails(String companyName) {
		return ipoDetailDao.findByCompanyName(companyName);
	}

	@Override
	public IpoDetail addIpoDetail(IpoDetail ipoDetail) {
		return ipoDetailDao.save(ipoDetail);
		
	}

}
