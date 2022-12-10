package com.simplilearn.foodboxproject.service;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.foodboxproject.model.Admin;
import com.simplilearn.foodboxproject.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	//Save Operation
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	//Read Operation
	public List<Admin> fetchAdminList() {
		// TODO Auto-generated method stub
		return (List<Admin>)adminRepository.findAll();
	}

	//Update Operation
	public Admin updateAdmin(Admin admin, int id) {
		// TODO Auto-generated method stub
		System.out.println("inside the updateAdmin method of service"+id);
		Admin adminDB=adminRepository.findById(id).get();
		
		if(Objects.nonNull(admin.getUsername()) 
				&& !"".equalsIgnoreCase(admin.getUsername())) {
			adminDB.setUsername(admin.getUsername());
		}
		
		if(Objects.nonNull(
				admin.getPassword())) {
			adminDB.setPassword(admin.getPassword());
		}
		return adminRepository.save(adminDB);
	}

	//Delete Operation
	public void deleteAdminById(int id) {
		// TODO Auto-generated method stub
		System.out.println("inside the deleteAdminById method of service :"+id);
		adminRepository.deleteById(id);
		
	}

	
	
	
	

}
