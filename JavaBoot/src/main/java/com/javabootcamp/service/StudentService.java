package com.javabootcamp.service;

import java.util.ArrayList;
import java.util.List;

import com.javabootcamp.model.Student;

public class StudentService implements IStudent {

	private static List<Student> list = new ArrayList<>();

	@Override
	public List<Student> findAll() {
		return list;
	}
	
	public Student add(Student s) {
		
		list.add(s);
		
		return s;
	}

}
