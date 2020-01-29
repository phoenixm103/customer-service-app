package com.Leads.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leads.customerservice.common.Converter;
import com.Leads.customerservice.model.CustomerMaster;
import com.Leads.customerservice.repository.CustomerMasterRepository;

@Service
public class CustomerMasterService {
	@Autowired
	private CustomerMasterRepository customerMasterRepository;
	
	public List<CustomerMaster> getAllCustomerMaster() {
		// TODO Auto-generated method stub
		return customerMasterRepository.findAll();
	}

	public CustomerMaster getCustomerMaster(int id) {
		return Converter.getCustomerMasterById(customerMasterRepository.findAll(),id);
	}

	public void addToCustomerMaster(CustomerMaster customerMaster) {
		customerMasterRepository.save(customerMaster);
		
	}

	public CustomerMaster getCustomerMasterByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return Converter.getCustomerMasterByCustomerId(customerMasterRepository.findAll(),customerId);
	}

}
