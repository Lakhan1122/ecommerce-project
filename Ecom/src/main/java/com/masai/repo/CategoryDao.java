package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Categorys;

public interface CategoryDao extends JpaRepository<Categorys, Integer> {

}
