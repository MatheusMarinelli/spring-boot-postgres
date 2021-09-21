package com.springboot.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.curso.entities.Order;
import com.springboot.curso.services.OrderService;

@RestController
@RequestMapping(value = "/orders") // localhost:8080/orders -> chama o método findAll
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping // método que funciona como um endpoint / retorna a lista list
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}
	

}
