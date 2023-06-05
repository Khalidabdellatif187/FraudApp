package com.example.FraudApp.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FraudApp.Entity.Fraud;
import com.example.FraudApp.Repository.FraudCheckHistoryRepository;


@Service
public class FraudCheck {
	
	
	
	private  FraudCheckHistoryRepository repositoy;
	
	
	
	
	
	
	@Autowired
	public FraudCheck(FraudCheckHistoryRepository repositoy) {
		super();
		this.repositoy = repositoy;
	}




	public boolean isFraudulentCustomer(Long customerId) {
		
		Fraud fraud = new Fraud();
		
		fraud.setCustomerId(customerId);
		fraud.setFraudster(false);
		fraud.setCreatedAt(LocalDateTime.now());
		
		
		repositoy.save(fraud);
		
		return false;
	}

}
