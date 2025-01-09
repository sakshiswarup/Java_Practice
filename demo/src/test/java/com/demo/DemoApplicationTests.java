package com.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.hibernate.internal.build.AllowSysOut;
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
		s.setMobile("9632629010");
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
	   boolean actualValue = service.deleteStudentById(3L);
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
	
   @Test
   void getStudentByEmail() {
	  Student student = service.getStudentByEmail(); 
	  System.out.println(student.getEmail());
	  System.out.println(student.getName());
	  System.out.println(student.getMobile());
	  System.out.println(student.getId());
   }
   
  @Test
   void getStudentByMobile() {
		Student student=service.getStudentByMobile();
		System.out.println(student.getEmail());
		System.out.println(student.getName());
		System.out.println(student.getMobile());
		System.out.println(student.getId());
	}
  
  
    @Test
    void getStudentByEmailAndMobile() {
    	Student student = service.getStudentByEmailAndMobile();
    	System.out.println(student.getEmail());
		System.out.println(student.getName());
		System.out.println(student.getMobile());
		System.out.println(student.getId());
    }
			
   @Test
   void getByEmailOrMobile() {
	   Iterable<Student> allRecords = service.getByEmailOrMobile();
	   for(Student s:allRecords) {
		      System.out.println(s.getId());
			  System.out.println(s.getName());
			  System.out.println(s.getEmail());
			  System.out.println(s.getMobile());
	   }
   } 
   
   @Test
   void searchStudentByEmail() {
	   Student student = service.searchStudentByEmail();
	   System.out.println(student.getEmail());
	   System.out.println(student.getName());
	   System.out.println(student.getMobile());
	   System.out.println(student.getId());
   }
   
   @Test
   void searchStudentByMobile() {
	   Student student = service.searchStudentByMobile();
	   System.out.println(student.getEmail());
	   System.out.println(student.getName());
	   System.out.println(student.getMobile());
	   System.out.println(student.getId());
   }

   
   @Test
   void searchStudentByEmailAndMobile() {
   	Student student = service.searchStudentByEmailAndMobile();
   	    System.out.println(student.getEmail());
		System.out.println(student.getName());
		System.out.println(student.getMobile());
		System.out.println(student.getId());
   }
   
   @Test
   void searchByEmailOrMobile() {
	   //List<Student> allRecords=service.searchStudentByEmailOrMobile();
	   Set<Student> allRecords=service.searchStudentByEmailOrMobile();
	   for(Student s : allRecords) {
		   System.out.println(s.getId()); 
			System.out.println(s.getName());
			System.out.println(s.getMobile());
			
	   }
   }
   //Entity Manager concept added with jpql 
   @Test
   void searchByEntityOption() {
	   Student student = service.findByEmail();
	   System.out.println(student.getName());
	   System.out.println(student.getEmail());
   }


  @Test
   void searchByOptionMobile() {
	  Student student=service.findByMobile();
	  System.out.println(student.getName());
	  System.out.println(student.getId());
	  System.out.println(student.getMobile());
  
 }
  @Test
  void searchByOptionEmailAndMobile() {
	  Student student = service.findByEmailAndMobile();
	  System.out.println(student.getMobile());
	  System.out.println(student.getName());
	  System.out.println(student.getEmail());
	  System.out.println(student.getId());
  }
  @Test
  void searchByOptionEmailOrMobile() {
	  List<Student> allRecords = service.findByEmailOrMobile();
	  for(Student s:allRecords) {
		  System.out.println(s.getName());
		  System.out.println(s.getId());
		  System.out.println(s.getEmail());
		  System.out.println(s.getMobile());
	  }
  }
}
