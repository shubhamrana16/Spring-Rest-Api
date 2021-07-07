package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.springboot.request.CreateStudentRequest;

 @Entity
 @Table(name = "student_details")
public class Student {
	
	  
	 @Id 
	 @Column(name = "id")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @Column(name = "studentName")
	 private String name;
	 
	 @NotBlank
	 @Column(name = "address")
	 private String addressString;

	 
	 
	 
	
	 
//	public Student(int id, String name, String addressString) {
//		 
//		this.id = id;
//		this.name = name;
//		this.addressString = addressString;
//	}
	
	
	public Student(CreateStudentRequest createStudentRequest) {
		
		this.id = createStudentRequest.getId();
		this.addressString = createStudentRequest.getAddressString();
		this.name = createStudentRequest.getName();
	}

	
	
	 public Student() {
			 
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
	
	 
	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	 
	 
	 
}
