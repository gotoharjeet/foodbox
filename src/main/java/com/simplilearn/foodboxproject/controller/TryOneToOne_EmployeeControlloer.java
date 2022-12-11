package com.simplilearn.foodboxproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodboxproject.model.TryOneToOne_Employee;
import com.simplilearn.foodboxproject.repository.TryOneToOne_EmployeeRepository;

@RestController
public class TryOneToOne_EmployeeControlloer {
	
	@Autowired
	private TryOneToOne_EmployeeRepository employeeRepository;
	
	@PostMapping("/saveEmployees")
	public ResponseEntity<String> saveEmployees(@RequestBody List<TryOneToOne_Employee> empdata)
	{
		empdata.forEach(e->System.out.println("EmpId" + e.getEmpid()+"EmpName"+e.getName()+"EmpAge"+e.getAge()+e.getAddress()));
		employeeRepository.saveAll(empdata);
		return ResponseEntity.ok("Data Saved");
	}

}
