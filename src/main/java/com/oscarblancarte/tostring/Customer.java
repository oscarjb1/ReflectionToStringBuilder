package com.oscarblancarte.tostring;

import java.io.Serializable;
import java.util.logging.Logger;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String tel;
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
