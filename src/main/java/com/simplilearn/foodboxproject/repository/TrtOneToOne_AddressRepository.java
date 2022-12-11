package com.simplilearn.foodboxproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.foodboxproject.model.TryOneToOne_Address;

public interface TrtOneToOne_AddressRepository extends JpaRepository<TryOneToOne_Address, Long> {

}
