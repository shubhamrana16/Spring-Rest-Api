package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.request.CreateStudentRequest;
import com.springboot.request.UpdateStudentRequest;
import com.springboot.response.StudentResponse;
import com.springboot.service.StudentService;

@RestController("/api/student/")
@RequestMapping("/api/student/")
public class StudentController {
	
	
//	@Value("${app.name: Default value}") //we can assign default value if property file is not working;
//	private String appmasseges;
	
	//@Value("${student.object}")
	 
	@Autowired
	private StudentService studentService;
	
	@GetMapping("get")
	public  List<StudentResponse>  getAllDetail(){
		
		List<Student> studentList = studentService.getAllDetail();
		
		List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>(); 
		
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		
		return studentResponseList;
		 
		 
	}
	
	@PostMapping("post")
	public StudentResponse saveDetails(@RequestBody CreateStudentRequest createStudentRequest) {
		
		Student student =  studentService.saveRecord(createStudentRequest);
		
		return new StudentResponse(student);			
		
	}
	
	 @PutMapping("update")
	 public StudentResponse updateStudent(@Valid @RequestBody UpdateStudentRequest updateStudentRequest) {
		 
	Student	student =  studentService.updateStudent(updateStudentRequest);
		 return new StudentResponse(student);
	 }
	 
	 
	 @DeleteMapping("delete")
	 public  String deleteStudentRequest(@RequestParam int id ) {
		 
		 studentService.deleteStudent(id);	 
		 
		 return  "Record is Successfully Deleted";
	 }
	 
	 @GetMapping("getByaddress/{address}")
	 public List<StudentResponse> getByAddress(@PathVariable String address) {
		 
		List<Student> studentlist =  studentService.getByAdress(address);
		
	List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>(); 
		
		studentlist.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		
		return studentResponseList;
		
	 }
	 
	 
	 @GetMapping("getByNameAndAddress/{name}/{address}")
	 
	 public List<StudentResponse> getByNameAddress(@PathVariable String name, @PathVariable String address) {
		 
		List<Student> studentlist =  studentService.getByNameAndAdress(name, address);
		
	List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>(); 
		
		studentlist.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		
		return studentResponseList;
		
	 }
	 
}






