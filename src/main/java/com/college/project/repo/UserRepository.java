package com.college.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.project.entity.User;




public interface UserRepository extends JpaRepository<User, Long> {
	
	
	 User findByEmail(String email);
	
	 User findByConfirmationToken(String confirmationToken);
	 
	  List<User> findAll();
}