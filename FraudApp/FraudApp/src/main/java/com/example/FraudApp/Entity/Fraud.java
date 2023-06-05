package com.example.FraudApp.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="fraud")
public class Fraud {
	
	
	public static Fraud builder() {
	      return new Fraud();
	   }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="is_fraudster")
	private boolean isFraudster;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;

	public Fraud(Long customerId, boolean isFraudster, LocalDateTime createdAt) {
		super();
		this.customerId = customerId;
		this.isFraudster = isFraudster;
		this.createdAt = createdAt;
	}
	
	
	
	public Fraud() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public boolean isFraudster() {
		return isFraudster;
	}



	public void setFraudster(boolean isFraudster) {
		this.isFraudster = isFraudster;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}



	@Override
	public String toString() {
		return "Fraud [id=" + id + ", customerId=" + customerId + ", isFraudster=" + isFraudster + ", createdAt="
				+ createdAt + "]";
	}
	
	
	
	
	
	
	

}
