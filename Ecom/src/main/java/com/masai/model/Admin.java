package com.masai.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AdminId;
	private String Name;
	private String PhoneNO;
	private String userId;
	private String passWord;
	
	@Embedded
	private Address address;

	public Integer getAdminId() {
		return AdminId;
	}

	public void setAdminId(Integer adminId) {
		AdminId = adminId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNO() {
		return PhoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		PhoneNO = phoneNO;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Admin(Integer adminId, String name, String phoneNO, String userId, String passWord, Address address) {
		super();
		AdminId = adminId;
		Name = name;
		PhoneNO = phoneNO;
		this.userId = userId;
		this.passWord = passWord;
		this.address = address;
	}

	public Admin() {
	}

	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", Name=" + Name + ", PhoneNO=" + PhoneNO + ", userId=" + userId
				+ ", passWord=" + passWord + ", address=" + address + "]";
	}
	
	
	
	
	

}
