package com.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
