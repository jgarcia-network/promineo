package com.promineotech.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventory.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
