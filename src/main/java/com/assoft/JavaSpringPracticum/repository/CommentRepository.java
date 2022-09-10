package com.assoft.JavaSpringPracticum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assoft.JavaSpringPracticum.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
