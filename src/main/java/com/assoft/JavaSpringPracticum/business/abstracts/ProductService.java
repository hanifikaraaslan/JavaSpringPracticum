package com.assoft.JavaSpringPracticum.business.abstracts;

import java.util.Date;
import java.util.List;

import com.assoft.JavaSpringPracticum.entities.Comment;
import com.assoft.JavaSpringPracticum.entities.Product;

public interface ProductService {

	public List<Product> expiredProducts();
	
	public List<Product> notExpiredProducts();
	
}
