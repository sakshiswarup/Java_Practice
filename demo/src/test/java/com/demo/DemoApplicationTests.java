package com.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

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
		s.setId(3L);
		s.setName("stallin");
		s.setEmail("stallin@gmail.com");
		s.setMobile("9632629033");
		Student student = service.createStudent(s);
		
		assertEquals(s.getId(),student.getId());
		assertEquals(s.getName(),student.getName());
		assertEquals(s.getEmail(),student.getEmail());
		System.out.println(student.getMobile());
		assertEquals(s.getMobile(),student.getMobile());
	}
    
   @Test
   void deleteStudent() {
	   //J unit testing 
	 // boolean actualValue = service.deleteStudentById(10L);
	   boolean actualValue = service.deleteStudentById(1L);
	  boolean expectedValue = false;
	  assertEquals(expectedValue, actualValue);
	  
   }
	
   @Test
   void findStudentById() {
	   boolean actualValue =service.findStudentById(1L);
	 //testing purpose  boolean actualValue = service.findStudentById(10L);
	   boolean expectedValue =true;
	   assertEquals(expectedValue,actualValue,"messege");
	   //testing purpose assertEquals(expectedValue,actualValue,"record not found");	   
	   
   }
   
   @Test
   void updateStudentRecord() {
	   Student updatedRecord = service.updateStudent();
	   assertEquals(1L,updatedRecord.getId(),"Id was not found in database");
	  // assertEquals("stallin",updatedRecord.getName(),"Name was not updated");
   }
   @Test
   void getAllRecords() {
	// service.getAllRecords();
	  Iterable<Student> allRecords= service.getAllRecords();
	  for(Student s:allRecords) {
		  System.out.println(s.getId());
		  System.out.println(s.getName());
		  System.out.println(s.getEmail());
		  System.out.println(s.getMobile());
	  }
   }
}
