package com.Leads.customerservice.rabbitmqlistener;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Leads.customerservice.common.CustomerVM;
import com.Leads.customerservice.model.CustomerLedger;
import com.Leads.customerservice.model.CustomerMaster;
import com.Leads.customerservice.repository.CustomerMasterRepository;
import com.Leads.customerservice.service.CustomerMasterService;


@Component
public class RabbitMQListener {
	
	@Autowired
	private CustomerMasterService customerMasterService;
	
	@Autowired
	private CustomerMasterRepository customerMasterRepository;
	
	@RabbitListener(queues = "${queue2.rabbitmq.queue}")
	public void recievedMessage(CustomerLedger customerLedger) {
		
		
		
		//double amount=customerMaster.getAmount();//+customerLedger.getAmount();
		//customerMaster.setLastTransactionDate(customerLedger.getTransactionDate());
		//customerMasterService.addToCustomerMaster(customerMaster);
		//System.out.println("Transaction Completed");
		CustomerMaster cmq=new CustomerMaster();
		int customerId=customerLedger.getCustomerId();
		List <CustomerMaster> cm=customerMasterRepository.findAll();
		for(int i=0;i<cm.size();i++) {
			CustomerMaster customerMaster=cm.get(i);
			 if(customerMaster.getCustomerId() ==customerId) {
				cmq=customerMaster;
			}
		}
		cmq.setAmount(cmq.getAmount()+customerLedger.getAmount());	
		cmq.setLastTransactionDate(customerLedger.getTransactionDate());
		customerMasterService.addToCustomerMaster(cmq);
		//System.out.println(customerLedger.getAmount()+"sfdas"+id);//+ " bla "+ amount);
	
	}	
	 
}