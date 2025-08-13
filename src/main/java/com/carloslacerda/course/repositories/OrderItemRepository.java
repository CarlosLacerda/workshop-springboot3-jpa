package com.carloslacerda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloslacerda.course.entities.OrderItem;
import com.carloslacerda.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
