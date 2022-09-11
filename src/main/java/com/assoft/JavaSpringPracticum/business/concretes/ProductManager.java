package com.assoft.JavaSpringPracticum.business.concretes;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.assoft.JavaSpringPracticum.business.abstracts.ProductService;
import com.assoft.JavaSpringPracticum.entities.Comment;
import com.assoft.JavaSpringPracticum.repository.CommentRepository;
import com.assoft.JavaSpringPracticum.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService{

	private ProductRepository productRepository;
	private CommentRepository commentRepository;
	@Override
	public List<Comment> commentByTime(List<Date> timeInterval, int productId) {
//		List<Comment> findall= commentRepository.findByProductId(productId);
//		findall=findall.stream().
//				filter(comment -> comment.getCommentDate().isBefore(timeInterval.get(1)) && comment.getCommentDate().
//						isAfter(timeInterval.get(0))).collect(Collectors.toList());
		return null;
	}

}
