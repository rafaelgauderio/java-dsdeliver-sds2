package com.devsupeior.dsdeliver.repositiries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.dsdeliver.entities.Product;

//all basic operations to access the database related to the product entity

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List <Product> findAllByOrderByNameAsc ();
		
	
}
