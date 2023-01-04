package com.simplilearn.foodboxproject.controller;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodboxproject.model.Admin;
import com.simplilearn.foodboxproject.service.AdminService;

import com.simplilearn.foodboxproject.model.*;
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
	@PutMapping("/updateAdmin/{id}")
	public Admin updateAdmin(@RequestBody Admin admin,@PathVariable("id") int id)
	{
		return adminService.updateAdmin(admin, id);
	}
	
	@DeleteMapping("/admins/{id}")
	public String deleteAdminById(@PathVariable("id")
												int id)
	{
		System.out.println("recode deleted sucessfully");
		adminService.deleteAdminById(id);
		return "Deleted Successfully............"+id;
	}
	
	//Verify 
	@SuppressWarnings("rawtypes")
	@PostMapping("/admins/{username}")
	public boolean verifyAdminLogin(@RequestBody Map loginData, @PathVariable(name = "username") String username, HttpSession session) {
		String lusername=(String) loginData.get("username");
		String lpassword=(String) loginData.get("password");
		
		Admin admin = adminService.findByusername(username);
		//System.out.println(admin.getUsername()+" "+admin.getPassword());
		if(admin!=null && admin.getUsername().equals(lusername) && admin.getPassword().equals(lpassword)) {
			session.setAttribute("adminUsername", lusername);
			//System.out.println(admin.getUsername()+" "+admin.getPassword());
			return true;
		}else {
			//System.out.println(admin.getUsername()+" "+admin.getPassword());
			return false;
		}
	}
	
	
}
