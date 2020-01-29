package com.Leads.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leads.customerservice.common.Converter;
import com.Leads.customerservice.model.CustomerLedger;
import com.Leads.customerservice.repository.CustomerLedgerRepository;





@Service
public class CustomerLedgerService {
	
	@Autowired
	private CustomerLedgerRepository customerLedgerRepository;
	
	public List<CustomerLedger> getAllCustomerLedger() {
		return customerLedgerRepository.findAll();
	}


	public void addToCustomerLedger(CustomerLedger customerLedger) {
		customerLedgerRepository.save(customerLedger);
	}


	public CustomerLedger getCustomerLedger(int id) {
		return Converter.getCustomerLedgerById(customerLedgerRepository.findAll(),id);
	}

}
