package com.example.FraudApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FraudApp.Entity.Fraud;

public interface FraudCheckHistoryRepository extends JpaRepository<Fraud , Long>{

}
