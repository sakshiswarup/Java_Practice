package com.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private StudentService service;
	
	
	@Test
	public void createStudentRegistration() {
		Student s = new Student();
		s.setId(1L);
		s.setName("mike");
		s.setEmail("mike@gmail.com");
		s.setMobile("9632629033");
		Student student = service.createStudent(s);
		
		assertEquals(s.getId(),student.getId());
		assertEquals(s.getName(),student.getName());
		assertEquals(s.getEmail(),student.getEmail());
		System.out.println(student.getMobile());
		assertEquals(s.getMobile(),student.getMobile());
	}

	
	
}
