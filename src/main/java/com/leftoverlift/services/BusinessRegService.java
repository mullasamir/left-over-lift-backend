package com.leftoverlift.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leftoverlift.dao.BusinessRegDao;
import com.leftoverlift.dto.BusinessRegRequest;
import com.leftoverlift.dto.BusinessRegResponse;
import com.leftoverlift.entity.Vendors;

@Component
public class BusinessRegService {
	
	@Autowired
	BusinessRegDao businessRegDao;
	
	public BusinessRegResponse BusinessReg(BusinessRegRequest businessbody) throws Exception{
		
		Vendors vendors = new Vendors();
		vendors.setOwnerName(businessbody.getOwnerName());
		vendors.setBusinessName(businessbody.getBusinessName());
		vendors.setAddress(businessbody.getAddress());
		vendors.setBussinessType(businessbody.getBusinessType());
		vendors.setCity(businessbody.getCity());
		vendors.setEmail(businessbody.getEmail());
		vendors.setPassword(businessbody.getPassword());
		vendors.setZipCode(businessbody.getZipCode());
		vendors.setState(businessbody.getState());
		vendors.setPhoneNumber(businessbody.getPhoneNumber());
		
		Vendors insertVendors = businessRegDao.save(vendors);
		
		BusinessRegResponse response = new BusinessRegResponse();
		response.setVendorId(insertVendors.getVendorId());
		response.setErrCode("000");
		response.setMessage("Business Added Sucessfully...");
		response.setRequest(businessbody);
		
		
		
		return response;
	}

}
