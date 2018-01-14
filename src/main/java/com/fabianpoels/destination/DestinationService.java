package com.fabianpoels.destination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DestinationService {

	public static void main(String[] args) {
		SpringApplication.run(DestinationService.class, args);
	}
	
	
}
