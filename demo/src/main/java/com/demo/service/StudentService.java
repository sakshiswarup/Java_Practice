package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	@Autowired
	private EntityManager entityManager;
	
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
//	public List<Student> searchStudentByEmailOrMobile() {
//		List<Student> student =repository.searchByEmailOrMobile("mike@gmail.com","9632629033");
//		return student;
//	}
	
	public Set<Student> searchStudentByEmailOrMobile() {
		Set<Student> student =repository.searchByEmailOrMobile("mike@gmail.com","9632629010");
		return student;
	} 
	//EntityManager + jpql
	public Student findByEmail(){
		String email="mike@gmail.com";
		// JPQL query to find student by email
		//"SELECT s FROM Student s WHERE s.email = :email"	//here all is  variables of enitity class
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s WHERE s.email = :email", Student.class);
        query.setParameter("email", email);
        
        Student student = query.getSingleResult();
       // query.getResultList()//for multiple value
        return student;
	}
	
	public Student findByMobile() {
		String mobile="9632629033";
		
		TypedQuery<Student> query = entityManager.createQuery("select t from Student t where t.mobile=:mobile",Student.class);
		query.setParameter("mobile",mobile);
		Student student=query.getSingleResult();
		return student;
	}
	public Student findByEmailAndMobile() {
		String email="mike@gmail.com";
		String mobile="9632629455";
		TypedQuery<Student> query= entityManager.createQuery("select x from Student x where email=:email and mobile=:mobile",Student.class);
		query.setParameter("email",email);
		query.setParameter("mobile",mobile);
		Student student = query.getSingleResult();
		return student;
	}
	public List<Student> findByEmailOrMobile() {
		String email="ram@gmail.com";
		String mobile="9632629455";
		TypedQuery<Student> query = entityManager.createQuery("select x from Student x where email=:email or mobile=:mobile",Student.class);
		query.setParameter("email", email);
		query.setParameter("mobile", mobile);
		List<Student> resultList = query.getResultList();
		return resultList;
		
	}
}
