package com.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
