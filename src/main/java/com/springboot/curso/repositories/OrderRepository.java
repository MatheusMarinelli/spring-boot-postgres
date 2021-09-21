package com.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
