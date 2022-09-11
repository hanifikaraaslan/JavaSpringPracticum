package com.assoft.JavaSpringPracticum.business.concretes;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.assoft.JavaSpringPracticum.business.abstracts.ProductService;
import com.assoft.JavaSpringPracticum.entities.Comment;
import com.assoft.JavaSpringPracticum.entities.Product;
import com.assoft.JavaSpringPracticum.repository.CommentRepository;
import com.assoft.JavaSpringPracticum.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService{

	private ProductRepository productRepository;
	
	@Override
	public List<Product> expiredProducts() {
		return productRepository.findByExpirationDateBefore();
	}

	@Override
	public List<Product> notExpiredProducts() {
		return productRepository.findByNotExpirationDateBefore();
	}


}
