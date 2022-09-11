package com.assoft.JavaSpringPracticum.business.abstracts;

import java.util.List;


import com.assoft.JavaSpringPracticum.entities.Comment;

public interface CommentService {
	
	public List<Comment> getByProductId(int id);
	public List<Comment> getByUserId (int userId );

}
