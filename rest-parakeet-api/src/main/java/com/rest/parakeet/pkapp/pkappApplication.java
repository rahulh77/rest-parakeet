package com.rest.parakeet.pkapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rest.parakeet.pkapp"})
public class pkappApplication {

	public static void main(String[] args) {
		SpringApplication.run(pkappApplication.class, args);
	}

}
