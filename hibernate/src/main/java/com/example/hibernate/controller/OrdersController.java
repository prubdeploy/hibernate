package com.example.hibernate.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.model.Orders;
import com.example.hibernate.repository.OrdersRepository;

	
@RestController
@RequestMapping(value="orders")
public class OrdersController {
		@Autowired
		OrdersRepository ordersRepo;
		
		@GetMapping(value="/")
		public List<Orders> findAll()
		{
			return ordersRepo.findAll();
		}
		
		@GetMapping(value="/{id}")
		public Orders findBYID(@PathVariable int  id) throws ClassNotFoundException, SQLException{
			return ordersRepo.findById(id).get();
		}
		
		@PostMapping(value="/")
		public Orders saveOrders(@RequestBody Orders orders) throws ClassNotFoundException, SQLException {
			System.out.println(orders);
			return ordersRepo.save(orders);
		}
		
		@PutMapping(value="/")
		public Orders  updateOrders(@RequestBody Orders orders) throws ClassNotFoundException, SQLException {
			return ordersRepo.save(orders);
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
		public boolean Delete(@PathVariable int  id) throws ClassNotFoundException, SQLException{
			ordersRepo.deleteById(id);
			return true;
		}

}
