package com.devsupeior.dsdeliver.repositiries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsupeior.dsdeliver.entities.Order;


//all basic operations to access the database related to the order entity

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrderWithProducts();
		
	
}
