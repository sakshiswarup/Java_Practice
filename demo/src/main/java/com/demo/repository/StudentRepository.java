package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
//finder methods
	
	//findByVariableName
	Optional<Student> findByEmail(String email);
	Optional<Student> findByMobile(String mobile);
	Optional<Student> findByEmailAndMobile(String email,String moblie);
	
	//Or method gives multiple records(collection of values)
	Iterable<Student> findByEmailOrMobile(String email,String mobile);
	
	//for custom query to build we can use jpql queries
	//JPQL query (java persistence Query Language)-it operates on entity
	
	@Query("select s from Student s where s.email=:x")//here s = Student alias name and Student is entity name
	Student searchByEmail(@Param("x") String email);
	
	@Query("select t from Student t where t.mobile=:m")
	Student searchByMobile(@Param("m") String mobile);
	
	@Query("select x from Student x where x.email=:email and x.mobile=:mobile")
	Student searchByEmailAndMobile(@Param("email")String email, @Param("mobile")String mobile);

	@Query("select x from Student x where x.email=:email or x.mobile=:mobile")
	//List is the below code return type
	// List<Student> searchByEmailOrMobile(@Param("email") String email,@Param("mobile") String mobile);
	//Set is the return type, List can have duplicate values but set cannot.
	Set<Student> searchByEmailOrMobile(@Param("email") String email,@Param("mobile") String mobile);
}
