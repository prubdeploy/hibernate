package com.example.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {

}
