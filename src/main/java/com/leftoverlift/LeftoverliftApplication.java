package com.leftoverlift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@SpringBootApplication
public class LeftoverliftApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeftoverliftApplication.class, args);
	}

}
