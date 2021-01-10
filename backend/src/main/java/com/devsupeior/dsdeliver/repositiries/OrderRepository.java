package com.devsupeior.dsdeliver.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.dsdeliver.entities.Order;


//all basic operations to access the database related to the order entity

public interface OrderRepository extends JpaRepository<Order, Long>{
		
	
}
