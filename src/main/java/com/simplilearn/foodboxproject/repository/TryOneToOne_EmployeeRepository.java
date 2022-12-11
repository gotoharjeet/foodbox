package com.simplilearn.foodboxproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.foodboxproject.model.TryOneToOne_Employee;

public interface TryOneToOne_EmployeeRepository extends JpaRepository<TryOneToOne_Employee, Long> {

}
