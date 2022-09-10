package com.assoft.JavaSpringPracticum.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "expiration_date", nullable = true)
	private LocalDate expirationDate;

	@OneToMany(mappedBy = "product")
	private List<Comment> comments;

}
