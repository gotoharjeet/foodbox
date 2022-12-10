package com.simplilearn.foodboxproject.service;

import java.util.List;

import com.simplilearn.foodboxproject.model.Admin;

public interface AdminService {

//	Save Operation
	Admin saveAdmin(Admin admin);

// Read Operation
	List<Admin> fetchAdminList();

// Update Operation
	Admin updateAdmin(Admin admin, String username);
// delete Operation
	void deleteAdminById(String username);
}
