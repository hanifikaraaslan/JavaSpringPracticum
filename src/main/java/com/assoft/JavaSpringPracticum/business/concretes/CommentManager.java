package com.assoft.JavaSpringPracticum.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assoft.JavaSpringPracticum.business.abstracts.CommentService;
import com.assoft.JavaSpringPracticum.entities.Comment;
import com.assoft.JavaSpringPracticum.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentManager implements CommentService {

	private CommentRepository commentRepository;

	@Override
	public List<Comment> getByProductId(int productId) {
		return commentRepository.findByProductId(productId);
	} 
	


}
