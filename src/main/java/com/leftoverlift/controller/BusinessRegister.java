package com.leftoverlift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leftoverlift.dto.BusinessRegRequest;
import com.leftoverlift.dto.BusinessRegResponse;
import com.leftoverlift.services.BusinessRegService;

@RestController
public class BusinessRegister {

	@Autowired
	BusinessRegService businessRegiter;

	@PostMapping("/api/business/register")
	public BusinessRegResponse addbusiness(@RequestBody BusinessRegRequest addbusinessbody) throws Exception {

		return businessRegiter.BusinessReg(addbusinessbody);
	}

}
