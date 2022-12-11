package com.simplilearn.foodboxproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.foodboxproject.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
