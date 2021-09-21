package com.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
