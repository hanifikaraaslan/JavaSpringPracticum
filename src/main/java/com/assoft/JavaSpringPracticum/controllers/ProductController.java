package com.assoft.JavaSpringPracticum.controllers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assoft.JavaSpringPracticum.business.abstracts.ProductService;
import com.assoft.JavaSpringPracticum.entities.Comment;
import com.assoft.JavaSpringPracticum.entities.Product;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/product/")
@RequiredArgsConstructor
public class ProductController {
	
	ProductService productService;
	
  @GetMapping("expiredProducts")
  public List<Product> expiredProducts(){
	  return productService.expiredProducts();
  }

}
