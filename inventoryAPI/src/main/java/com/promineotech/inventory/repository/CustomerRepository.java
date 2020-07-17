package com.promineotech.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventory.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
