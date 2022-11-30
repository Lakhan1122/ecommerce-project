package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Categorys;
import com.masai.model.Product;
import com.masai.repo.CategoryDao;
import com.masai.repo.ProductDao;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private ProductDao Pdao;
	
	@Autowired
	private CategoryDao Cdao;
	
	@Override
	public String AddProduct(Product product) {
		// TODO Auto-generated method stub
		Integer Cid=product.getCategorys().getCatId();
		Optional<Categorys> data= Cdao.findById(Cid);
		if(data.isPresent()) {
			Pdao.save(product);
			return "Added";
		}else {
			
			return "CAtegorys not found";
		}
	}


	@Override
	public List<Product> GetAllProducts() {
		List<Product> data= Pdao.findAll();
		if(data.size()>0) {
			return data;
		}else {
			System.out.println("no Product added");
			return null;
		}
	}


	@Override
	public String UpdateProduct(Integer id, Product product) {
		
		Optional<Product> data=Pdao.findById(id);
		if(data.isPresent()) {
			Product updat= data.get();
			updat.setCategorys(product.getCategorys());
			updat.setDescription(product.getDescription());
			updat.setMarketprice(product.getMarketprice());
			updat.setProductimg(product.getProductimg());
			updat.setProductname(product.getProductname());
			updat.setSaleprice(product.getSaleprice());
			Pdao.save(updat);
			return "done";
		}
		
		return"no";
	}


	@Override
	public String DeleteProduct(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Product> data=Pdao.findById(id);
		if(data.isPresent()) {
			Pdao.delete(data.get());
			return "Deleted";
		}
		return "Not Delete";
	}


	
	
	
	
	
	
	
	 
	


}
