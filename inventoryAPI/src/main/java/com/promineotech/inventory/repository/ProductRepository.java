package com.promineotech.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventory.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
