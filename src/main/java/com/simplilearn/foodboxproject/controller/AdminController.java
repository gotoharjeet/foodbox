package com.simplilearn.foodboxproject.controller;

import java.util.Arrays;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodboxproject.model.Admin;
import com.simplilearn.foodboxproject.service.AdminService;


@RestController
//@RequestMapping("/admins")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	//Welcome Operation
	@GetMapping("/")
	public List<Admin> print() {
		System.out.println("Wahe Guru Ji");
		return Arrays.asList(new Admin(1,"admin","admin"));
	}
	//Save Operation
	@PostMapping("/saveAdmin")
	public Admin saveAdmin(@Validated @RequestBody
			Admin admin)
	{
		System.out.println("saveAdmin worked properly");
		return adminService.saveAdmin(admin);
	}
	
	//Read Operation
	@PostMapping("/adminList")
	public List<Admin> fetchAdminList()
	{
		return adminService.fetchAdminList();
	}
	
//	Upadate Operation
	public Admin updateAdmin(@RequestBody Admin admin,@PathVariable("username") String username)
	{
		return adminService.updateAdmin(admin, username);
	}
	
	@DeleteMapping("admins/{username}")
	public String deleteAdminById(@PathVariable("username")
												String username)
	{
		return "Deleted Successfully";
	}
}
