package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Categorys;
import com.masai.services.CategoryServices;

@RestController
public class CategoryController {
	@Autowired
	private CategoryServices services;
	
	
	@PostMapping("/admin/addcategorys")
	ResponseEntity<Categorys> AddCategorysHandler(Categorys cat){
		Categorys data=  services.AddCategory(cat);
		
		return new ResponseEntity<Categorys>(data, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/admin/deletecategorys/{id}")
	ResponseEntity<String> DeleteCategorysHandler(@PathVariable Integer id){
		
		String data= services.DeleteCategory(id);
		
		return new ResponseEntity<String>(data, HttpStatus.OK);
			
	}
	
	@PutMapping("/admin/updatedcategorys/{id}")
	ResponseEntity<Categorys>UpdateCategorysHandler(@PathVariable Integer id, Categorys cat){
		
		Categorys data= services.UpdatedCategory(id, cat);
		
		return new ResponseEntity<Categorys>(data, HttpStatus.OK);
		
	}
	
	@GetMapping("/admin/categorys")
	ResponseEntity<List<Categorys>> AllListOfCategorys(){
		
		List<Categorys> data= services.AllCategorys();
		
		return new ResponseEntity<List<Categorys>>(data, HttpStatus.OK);
	}

}
