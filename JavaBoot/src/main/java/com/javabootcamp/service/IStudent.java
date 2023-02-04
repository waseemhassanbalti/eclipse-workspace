package com.javabootcamp.service;

import java.util.List;

import com.javabootcamp.model.Student;

public interface IStudent {
	List<Student> findAll();
	Student add(Student s);
}
