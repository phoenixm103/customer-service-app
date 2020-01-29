package com.Leads.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leads.customerservice.model.CustomerLedger;

public interface CustomerLedgerRepository extends JpaRepository<CustomerLedger, Integer> { 

}
