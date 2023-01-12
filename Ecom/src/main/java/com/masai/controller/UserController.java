package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Cart;
import com.masai.model.Product;
import com.masai.model.User;
import com.masai.services.UserServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {
	
	
	@Autowired
	private UserServices Uservices;
	
	@PostMapping("/user/register")
	public ResponseEntity<User> RegisterHandler(@RequestBody User user){
       User data= Uservices.Register(user);	
       return new ResponseEntity<User>(data, HttpStatus.CREATED);
	}
	
	@PutMapping("/user/update")
	public ResponseEntity<User> UpdateUserHandler(@RequestParam Integer id, @RequestBody User user){
		User data=Uservices.UpdateUser(id, user);
		
		return new ResponseEntity<User>(data, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/user/delete")
	public ResponseEntity<String> DeleteUserHandler(@RequestParam Integer id){
		
		String data= Uservices.DeleteUser(id);
		
		return new ResponseEntity<String>(data, HttpStatus.OK);
	}
	
	@GetMapping("/user/viewproduct")
	public ResponseEntity<List<Product>> ViewProduct()
	{
		List<Product> products=Uservices.product();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	
	@PostMapping("/user/addtocart")
	public ResponseEntity<String> AddTocartHandler(Integer userid, Integer Productid){
		
		String data= Uservices.product(userid, Productid);
		return new ResponseEntity<String>(data, HttpStatus.OK);
		
	}
	
	
//	@GetMapping("user/getcart")
//	public ResponseEntity<Cart> GetcartDetailsHandler(@RequestParam Integer id){
//     Cart cart = Uservices.getCart(id);
//     return new ResponseEntity<Cart>(cart, HttpStatus.OK);
//		
//		
//	}
	
	
	
	@GetMapping("/user/buy")
	public ResponseEntity<String> buyProductHandler(@RequestParam Integer userid,@RequestParam Integer Productid){
		String data = Uservices.buyproduct(userid, Productid);
		return new ResponseEntity<String>(data, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
