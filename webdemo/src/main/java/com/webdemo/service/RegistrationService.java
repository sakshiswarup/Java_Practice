package com.webdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdemo.entity.Registration;
import com.webdemo.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
private RegistrationRepository registrationRepository;
	
	public void saveRegistration(Registration registration) {
		registrationRepository.save(registration);
	}

	public List<Registration> getRegistrations() {
		List<Registration> registrations = registrationRepository.findAll();
		return registrations;
	}

}
