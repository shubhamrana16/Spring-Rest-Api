package com.springboot.response;

import com.springboot.entity.Student;

public class StudentResponse {
	
	private int id;
	
	//@JsonProperty
	private String name;
	
	private String addressString;
	
	public StudentResponse(Student student) {
		this.id = student.getId();
		this.addressString = student.getAddressString();
		this.name = student.getName();
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

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

	 
	
	
	
	

}
