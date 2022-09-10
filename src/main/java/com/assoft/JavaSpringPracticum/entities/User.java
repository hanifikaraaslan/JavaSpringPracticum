package com.assoft.JavaSpringPracticum.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="first_name",nullable = false)
    @Size(max = 50)
    private String firstName;

    @Column(name="last_name", nullable = false)
    @Size(max = 50)
    private String lastName;

    @Column(name="email", nullable = false)
    @Size(max = 50)
    private String email;

    @Column(name="phone_number", nullable = false)
    @Size(max = 15)
    private String phoneNumber;
    
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

}
