package com.assoft.JavaSpringPracticum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assoft.JavaSpringPracticum.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
