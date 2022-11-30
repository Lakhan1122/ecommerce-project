package com.masai.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Cart;
import com.masai.model.User;

public interface CartDao extends JpaRepository<Cart, Integer> {

	public Optional<Cart> findByuser(Integer id);
	
}
