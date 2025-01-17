package com.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdemo.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
