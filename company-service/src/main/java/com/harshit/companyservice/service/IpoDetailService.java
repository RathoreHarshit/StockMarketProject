package com.harshit.companyservice.service;


import java.util.List;

import com.harshit.companyservice.model.IpoDetail;

public interface IpoDetailService {

	public List<IpoDetail> getIpoDetails(String companyName);	
	public IpoDetail addIpoDetail(IpoDetail ipoDetail);
	
	
}
