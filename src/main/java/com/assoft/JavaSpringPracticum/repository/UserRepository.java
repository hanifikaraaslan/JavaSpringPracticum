package com.assoft.JavaSpringPracticum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assoft.JavaSpringPracticum.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
