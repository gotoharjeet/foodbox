package com.simplilearn.foodboxproject.service;

import java.util.List;

import com.simplilearn.foodboxproject.model.Admin;

public interface AdminService {

	
//	Save Operation
	Admin saveAdmin(Admin admin);

// Read Operation
	List<Admin> fetchAdminList();

// Update Operation
	Admin updateAdmin(Admin admin, int id);
// delete Operation
	void deleteAdminById(int id);
// FindByusername
	Admin findByusername(String username);
}
