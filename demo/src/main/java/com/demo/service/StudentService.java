package com.demo.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	//write Create Student Registration
	
	public Student createStudent(Student student) {
		Student s = repository.save(student);
		return s;
	}
//	@Test
//	void deleteStudent() {
//		Optional<Student> opStudent =repository.findById(1L);
//		if(opStudent.isPresent()) {
//			System.out.println("Present");
//		}else {
//			System.out.println("Null reference");
//		}
//	}
	
	public boolean deleteStudentById(Long id) {
		repository.deleteById(id);
		Optional<Student> opStudent = repository.findById(id);
		//for j unit testing-Optional<Student> opStudent = repository.findById(1L);
		if(opStudent.isPresent()) {
			return true;
		}else {
			return false;
		}
	}

	public boolean findStudentById(long id) {
		Optional<Student> opStudent = repository.findById(id);
		if(opStudent.isPresent()) {
			return true;
		}else {
			return false;
		}
	}

	public Student updateStudent() {
		Student s = new Student();
		s.setId(1L);
		s.setName("mike");
		s.setEmail("mike@gmail.com");
		s.setMobile("9632629455");
		return repository.save(s);
	}

	public Iterable<Student> getAllRecords() {
//		Iterable<Student> itrStudent = repository.findAll();//Iterable<>- collection of object present in it
//		System.out.println(itrStudent);
		
		return repository.findAll();
	}
	
	//find by email with the use of finder method
	public Student getStudentByEmail() {
		Optional<Student> opStudent= repository.findByEmail("mike@gmail.com");
		if(opStudent.isPresent()) {
			Student student = opStudent.get();
			return student;
		}
		return null;
		}
	
	public Student getStudentByMobile() {
		Optional<Student> opStudent = repository.findByMobile("9632629455");
		if(opStudent.isPresent()) {
			Student student = opStudent.get();
			return student;
		}
		return null;
	}
	
	public Student getStudentByEmailAndMobile() {
		Optional<Student> opStudent = repository.findByEmailAndMobile("mike@gmail.com", "9632629033");
		if(opStudent.isPresent()) {
			Student student=opStudent.get();
			return student;
		}
		return null;
	}
	public Iterable<Student> getByEmailOrMobile(){
		return repository.findByEmailOrMobile("ram@gmail.com", "9632629455");
	}
	
	public Student searchStudentByEmail() {
		Student student = repository.searchByEmail("mike@gmail.com");
		return student;
	}
	
	public Student searchStudentByMobile() {
		Student student = repository.searchByMobile("9632629455");
		return student;
	}
	
	public Student searchStudentByEmailAndMobile() {
	Student student = repository.searchByEmailAndMobile("mike@gmail.com", "9632629455");
		return student;
	}
	}
