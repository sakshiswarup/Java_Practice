package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private StudentRepository repository;
	
	@Test
	void saveStudent() {
		Student s = new Student();
		s.setId(1L);
		s.setName("mike");
		s.setEmail("mike@gmail.com");
		s.setMobile("9295776639");
		repository.save(s);	
	}
	@Test
	void deleteStudent(){
		repository.deleteById(1L);
	}
	
	@Test
	void updateStudent() {
		Student s = new Student();
		s.setId(1L);
		s.setName("stallin");
		s.setEmail("stallin@gmail.com");
		s.setMobile("9595776639");
		repository.save(s);	
	
	}

}
