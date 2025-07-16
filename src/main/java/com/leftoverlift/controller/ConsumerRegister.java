package com.leftoverlift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leftoverlift.dto.ConsumerRegRequest;
import com.leftoverlift.dto.ConsumerRegResponse;
import com.leftoverlift.services.ConsumerRegService;

@CrossOrigin(origins = "http://localhost:5173")

@RestController
public class ConsumerRegister {
	
	@Autowired
	ConsumerRegService consumerRegister;
	
	@PostMapping("/api/consumers/register")
	public ConsumerRegResponse adduser(@RequestBody ConsumerRegRequest addconsumerbody) throws Exception {
		

		return consumerRegister.ConsumerReg(addconsumerbody);

	}
}
