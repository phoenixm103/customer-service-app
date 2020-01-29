package com.Leads.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Leads.customerservice.model.CustomerLedger;
import com.Leads.customerservice.service.CustomerLedgerService;
import com.Leads.customerservice.service.RabbitMQSender;

@RestController
public class CustomerLedgerController {
	@Autowired
	private CustomerLedgerService customerLedgerService;
	
	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	
	@RequestMapping(method=RequestMethod.GET, value = "/customerLedgers")
	public List<CustomerLedger> getAllCustomerLedger(){
		return customerLedgerService.getAllCustomerLedger();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/customerLedgers/{id}")
	public CustomerLedger getCustomerLedger(@PathVariable int id) {
		return customerLedgerService.getCustomerLedger(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/customerLedgers")
	public void addToCustomerLedger(@RequestBody CustomerLedger customerLedger) {
		customerLedgerService.addToCustomerLedger(customerLedger);
		rabbitMQSender.send(customerLedger);
		System.out.println("Pending");
		
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
