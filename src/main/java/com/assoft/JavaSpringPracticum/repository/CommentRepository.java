package com.assoft.JavaSpringPracticum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assoft.JavaSpringPracticum.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
	
	 List<Comment> findByProductId(int productId);
	 List<Comment> findByUserId(int userId);

}
