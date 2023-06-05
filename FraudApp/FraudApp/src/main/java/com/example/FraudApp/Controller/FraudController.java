package com.example.FraudApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FraudApp.Service.FraudCheck;

@RestController
@RequestMapping("/api/v1/fraud-check")
public class FraudController {
	
	
	private FraudCheck fraudserv;

	
	
	
	@Autowired
	public FraudController(FraudCheck fraudserv) {
		super();
		this.fraudserv = fraudserv;
	}





	@GetMapping(path = "{customerId}")
	public FraudCheckResponse isFraud(@PathVariable ("customerId") Long customerId) {
		
		
		boolean isFraudulentCustomer = fraudserv.isFraudulentCustomer(customerId);
		
		FraudCheckResponse fraudcheckresponse = new FraudCheckResponse(isFraudulentCustomer);
		
		
		return fraudcheckresponse;
		
		
	}

}
