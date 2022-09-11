package com.assoft.JavaSpringPracticum.business.abstracts;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


import com.assoft.JavaSpringPracticum.entities.Comment;

public interface CommentService {
	
	public List<Comment> getByProductId(int id);
	public List<Comment> getByUserId (int userId );
	public List<Comment> commentsByDateRange (List<LocalDate> dates);

}
