package com.example.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate.model.Items;

public interface ItemsRepository extends JpaRepository<Items,String>{

}
