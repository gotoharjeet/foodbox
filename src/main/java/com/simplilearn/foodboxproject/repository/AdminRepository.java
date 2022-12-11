package com.simplilearn.foodboxproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.foodboxproject.model.Admin;


public interface AdminRepository extends JpaRepository<Admin,Integer>{
	
	Admin findByusername(String username);

}
