package com.Leads.customerservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerMaster {
	@Id
	private int id;
	private int customerId;
	private Double amount;
	private Date lastTransactionDate;
	
	public CustomerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerMaster(int id, int customerId, Double amount, Date lastTransactionDate) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.amount = amount;
		this.lastTransactionDate = lastTransactionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	
	
}