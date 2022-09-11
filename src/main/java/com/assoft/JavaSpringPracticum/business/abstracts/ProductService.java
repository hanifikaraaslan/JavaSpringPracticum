package com.assoft.JavaSpringPracticum.business.abstracts;

import java.util.Date;
import java.util.List;

import com.assoft.JavaSpringPracticum.entities.Comment;

public interface ProductService {

	List<Comment> commentByTime(List<Date> timeInterval, int productId);
}
