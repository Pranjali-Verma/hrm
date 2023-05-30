package com.HMS.HotelManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties
//@EntityScan(basePackages = {"com.HMS.HotelManagementSystem.pojos"})  // scan JPA entities
//@EntityScan("com.HMS.HotelManagementSystem.controller")
public class HotelManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSystemApplication.class, args);
	}

}
