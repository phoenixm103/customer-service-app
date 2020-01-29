package com.Leads.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Leads.customerservice.model.CustomerMaster;
import com.Leads.customerservice.service.CustomerMasterService;



@RestController
public class CustomerMasterController {
	@Autowired
	private CustomerMasterService customerMasterService;
	
	@RequestMapping(method=RequestMethod.GET, value = "/customerMasters")
	public List<CustomerMaster> getAllCustomerMaster(){
		return customerMasterService.getAllCustomerMaster();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/customerMasters/{id}")
	public CustomerMaster getCustomerMaster(@PathVariable int id) {
		return customerMasterService.getCustomerMaster(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/customerMasters")
	public void addToCustomerMaster(@RequestBody CustomerMaster customerMaster) {
		customerMasterService.addToCustomerMaster(customerMaster);
	}
	
	/*@RequestMapping(method=RequestMethod.PUT, value = "/bankLedgers/{id}")
	public void updateBankLedger(@PathVariable Long id, @RequestBody BankLedger bankLedger) {
		bankLedgerService.updateBankLedger(id, bankLedger);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/bankLedgers/{id}")
	public void deleteFromBankLedger(@PathVariable Long id) {
		bankLedgerService.deleteFromBankLedger(id);
	}*/

}
