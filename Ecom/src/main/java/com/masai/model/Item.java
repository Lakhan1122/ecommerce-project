package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemid;
	@OneToOne
	private Product product;
	private Integer Quantity;
	
	private Double Total;

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", product=" + product + ", Quantity=" + Quantity + ", Total=" + Total + "]";
	}

	public Item(Integer itemid, Product product, Integer quantity, Double total) {
		super();
		this.itemid = itemid;
		this.product = product;
		Quantity = quantity;
		Total = total;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
