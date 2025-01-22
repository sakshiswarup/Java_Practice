package com.webdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdemo.dto.RegistrationDto;
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
		//findAll( return type is iterable(in crud repository) but here we use jpa repository so return type is List
		return registrations;
	}

	public void deleteRegistration(long id) {
		registrationRepository.deleteById(id);
		
	}

	public Registration getRegistration(long id) {
	return registrationRepository.findById(id).get();	
	}

	public void updateRegistration(RegistrationDto dto) {
		Registration registration = registrationRepository.findById(dto.getId()).get();
		registration.setName(dto.getName());
		registration.setEmailId(dto.getEmailId());
		registration.setMobile(dto.getMobile());
		registrationRepository.save(registration);
	}

}
