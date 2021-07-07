package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;
import com.springboot.request.CreateStudentRequest;
import com.springboot.request.UpdateStudentRequest;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	 
	//=========================================================================
	//Get Student Record From DB
	
	
	public List<Student> getAllDetail() {
		 
		return studentRepository.findAll();
	}
	
	//==========================================================================
	//create student record in DB
	
	
	
	public Student saveRecord(CreateStudentRequest createStudentRequest) {
		Student student = new Student(createStudentRequest);
		
		student = studentRepository.save(student);
		
		return student;
		
	}
	
	//==========================================================================
	//Update Student Record
	
	public Student updateStudent(UpdateStudentRequest updateStudentRequest) {
		
		Student student = studentRepository.findById(updateStudentRequest.getId()).get();
		
			if(updateStudentRequest.getName() !=null && !updateStudentRequest.getName().isEmpty()) {
				student.setName(updateStudentRequest.getName());
			}
			
			studentRepository.save(student);
		
		return student;
		
	}
	
	
	//==========================================================================
	//Delete Student Record
	
	public void  deleteStudent(int id ){
		
		studentRepository.deleteById(id);
		 
	}
	
	//==========================================================================
	//Get student record by its address
	
	
	
	public List<Student> getByAdress(String address) {
		
		List<Student> studentList = studentRepository.findByAddressString(address);
		
		return studentList;
		 
		
		
	}
	
	
	//==========================================================================
	//Get student record by its name and address
	
public List<Student> getByNameAndAdress(String name, String address) {
		
		List<Student> studentList = studentRepository.findByNameAndAddressString(name,address);
		
		return studentList;
		 
		
		
	}
	
	
	

}







