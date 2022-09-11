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

import com.assoft.JavaSpringPracticum.entities.Comment;

@RestController
@RequestMapping("api/v1/product/")
public class ProductController {
	
	   @GetMapping("commentTimeİnterval/{productId}")
	    public List<Comment> findCommentByDateWithUser(@RequestBody List<Date> timeİnterval, @RequestParam int productId ) {
	        return null;
	    }
	   

}
