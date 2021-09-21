package com.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
