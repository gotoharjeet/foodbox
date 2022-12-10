package com.simplilearn.foodboxproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.simplilearn.foodboxproject.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
	
	

}
