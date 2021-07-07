package com.springboot.request;

public class CreateStudentRequest {
	
	private int id;
	
	//@JsonProperty
	private String name;
	
	private String addressString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	 
	
	
	

}
