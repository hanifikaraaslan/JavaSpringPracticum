package com.assoft.JavaSpringPracticum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assoft.JavaSpringPracticum.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("From Product where expirationDate < current_date")
	List<Product> findByExpirationDateBefore();
	
	@Query("From Product where expirationDate >= current_date")
	List<Product> findByNotExpirationDateBefore();

//	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
//		  List<Product> getByNameAndCategory(String productName, int categoryId);
	
//	@Query("select * from product \r\n"
//			+ "where dtarih between '01/01/1995' and '12/31/2000'")
//	public List<Product> get

}
