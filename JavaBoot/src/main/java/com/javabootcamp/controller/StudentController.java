package com.javabootcamp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabootcamp.model.Student;
import com.javabootcamp.service.IStudent;


@RestController
public class StudentController {
	
	IStudent stud ;
	
	public StudentController(){
		
	}
	
	@GetMapping(value = "/getAll")  
	public List<Student> getStudent(){
		return stud.findAll();
	}
	@GetMapping(value = "/add")  
	public Student addStudent(Student studDTO) {
		
		return stud.add(studDTO);
	}
	
}
