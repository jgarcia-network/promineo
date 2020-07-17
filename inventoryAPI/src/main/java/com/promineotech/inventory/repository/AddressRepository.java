package com.promineotech.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventory.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
