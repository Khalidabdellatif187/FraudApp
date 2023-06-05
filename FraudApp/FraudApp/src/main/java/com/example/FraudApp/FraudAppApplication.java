package com.example.FraudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FraudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudAppApplication.class, args);
		
		
	}

}
