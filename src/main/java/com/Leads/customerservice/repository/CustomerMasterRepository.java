package com.Leads.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leads.customerservice.model.CustomerMaster;

public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Integer> {

}
