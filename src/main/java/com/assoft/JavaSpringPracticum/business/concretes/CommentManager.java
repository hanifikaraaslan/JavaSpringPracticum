package com.assoft.JavaSpringPracticum.business.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public List<Comment> getByUserId(int userId) {
		return commentRepository.findByUserId(userId);
	}

	@Override
	public List<Comment> commentsByDateRange(List<LocalDate> dates) {
		List<Comment> comments= commentRepository.findAll();
		List<Comment> betweenComments=comments.stream().filter(comment -> comment.getCommentDate().isBefore(dates.get(1)) &&
				comment.getCommentDate().isAfter(dates.get(0))).collect(Collectors.toList());
		return betweenComments;
	} 
	


}
