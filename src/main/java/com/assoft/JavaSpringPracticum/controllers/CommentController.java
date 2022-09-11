package com.assoft.JavaSpringPracticum.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assoft.JavaSpringPracticum.business.abstracts.CommentService;
import com.assoft.JavaSpringPracticum.entities.Comment;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/comment/")
@RequiredArgsConstructor
public class CommentController {
	
	private CommentService commentService;

   @GetMapping("findByProductId/{productId}")
   public List<Comment> getByProductId (@PathVariable int productId ) {
	   return commentService.getByProductId(productId);
   }
   @GetMapping("findByUserId/{userId}")
   public List<Comment> getByUsertId (@PathVariable int userId ) {
	   return commentService.getByUserId(userId);
   }
   
   @GetMapping("commentsByDateRange")
   public List<Comment> commentsByDateRange(@RequestBody List<LocalDate> dates){
	   return null;
   }
   @GetMapping("commentsByDateRangeAndUser/{userId}")
   public List<Comment> commentsByDateRange(@RequestBody List<LocalDate> dates, @PathVariable int userId){
	   return null;
   }
}
