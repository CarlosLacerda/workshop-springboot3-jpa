package com.carloslacerda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloslacerda.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
