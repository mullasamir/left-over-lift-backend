package com.leftoverlift.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leftoverlift.dao.BusinessRegDao;
import com.leftoverlift.dao.ConsumerRegDao;
import com.leftoverlift.dto.LoginRequest;
import com.leftoverlift.dto.LoginResponse;
import com.leftoverlift.entity.Consumers;
import com.leftoverlift.entity.Vendors;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

	@Autowired
	private ConsumerRegDao consumerRegDao;

	@Autowired
	private BusinessRegDao businessRegDao;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
	    Optional<Consumers> consumerOpt = consumerRegDao.findByEmail(loginRequest.getEmail());

	    if (consumerOpt.isPresent()) {
	        Consumers consumer = consumerOpt.get();
	        if (consumer.getPassword().equals(loginRequest.getPassword())) {
	            return ResponseEntity.ok().body(
	                new LoginResponse("consumer", consumer.getConsumerId(), "Login successful as Consumer")
	            );
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	                                 .body("Invalid password for consumer");
	        }
	    }

	    Optional<Vendors> vendorOpt = businessRegDao.findByEmail(loginRequest.getEmail());

	    if (vendorOpt.isPresent()) {
	        Vendors vendor = vendorOpt.get();
	        if (vendor.getPassword().equals(loginRequest.getPassword())) {
	            return ResponseEntity.ok().body(
	                new LoginResponse("vendor", vendor.getVendorId(), "Login successful as Vendor")
	            );
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	                                 .body("Invalid password for vendor");
	        }
	    }

	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not registered.");
	}

}
