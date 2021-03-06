package com.springboot.request;

import javax.validation.constraints.NotNull;

public class UpdateStudentRequest {
	
	@NotNull(message = "Id is required")
    private int id;
	
	//@JsonProperty
	private String name;
	
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
