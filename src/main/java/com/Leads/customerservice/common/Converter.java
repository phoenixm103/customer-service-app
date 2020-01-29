package com.Leads.customerservice.common;

import java.util.List;

import com.Leads.customerservice.model.CustomerLedger;
import com.Leads.customerservice.model.CustomerMaster;


public class Converter {
	
	public static CustomerLedger getCustomerLedgerById(List<CustomerLedger> cl, int id) {
		
		for(int i=0;i<cl.size();i++) {
			CustomerLedger customerLedger=cl.get(i);
			if(customerLedger.getTransactionId()==id) {
			return customerLedger;	
			}
		}
		return null;
	}

	public static CustomerMaster getCustomerMasterById(List<CustomerMaster> findAll, int id) {
		for(int i=0;i<findAll.size();i++) {
			CustomerMaster customerMaster=findAll.get(i);
			if(customerMaster.getId()==id) {
			return customerMaster;	
			}
			}
		return null;
	}

	public static CustomerMaster getCustomerMasterByCustomerId(List<CustomerMaster> findAll, int customerId) {
		for(int i=0;i<findAll.size();i++) {
			CustomerMaster customerMaster=findAll.get(i);
			if(customerMaster.getCustomerId() ==customerId) {
			return customerMaster;	
			}
			}
		return null;
	}
}
