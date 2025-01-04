package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@Service
public class StudentService {
  
	private StudentRepository repository;
	//write Create Student Registration
	
	public Student createStudent(Student student) {
		Student s = repository.save(student);
		return s;
	}
}
