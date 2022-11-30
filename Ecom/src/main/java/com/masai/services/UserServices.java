package com.masai.services;

import java.util.List;

import com.masai.model.Cart;
import com.masai.model.Product;
import com.masai.model.User;

public interface UserServices {
	
	public User Register(User user);
	public User UpdateUser(Integer id, User user);
	public String DeleteUser(Integer id);
	public List<Product> product();
	
	public String product(Integer userid,Integer productid);
	public String buyproduct(Integer userid,Integer productid);
	
//	public Cart getCart(Integer id);
	
	
	
	
}
