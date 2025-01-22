package com.webdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webdemo.dto.RegistrationDto;
import com.webdemo.entity.Registration;
import com.webdemo.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
    private RegistrationService registrationService;
	
	//Handler Method
	
	// http://localhost:8080/view
	
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "registration";
	}
	
	@RequestMapping("/saveRegistration")
	public String saveRegistrationDetails( 
			//first approch //@ModelAttribute  Registration registration,
			//second way to reading data
//			@RequestParam String name,
//			@RequestParam String emailId,
//			@RequestParam String mobile,
			//third way
			
			RegistrationDto registrationDto,
			Model model
			
			) {
		Registration registration = new Registration();
		//in second way to use but here we use dto approch
//		registration.setName(name);
//		registration.setEmailId(emailId);
//		registration.setMobile(mobile);
		//in third way
		registration.setName(registrationDto.getName());
		registration.setEmailId(registrationDto.getEmailId());
		registration.setMobile(registrationDto.getMobile());
		
//		System.out.println(registration.getName());
//		System.out.println(registration.getEmailId());
//		System.out.println(registration.getMobile());
		
		registrationService.saveRegistration(registration);
		model.addAttribute("msg","Record is saved");
		return "registration";
	}
	
	@RequestMapping("/allRegistration")
	public String getRegistrations(Model model){
		List<Registration>registration=registrationService.getRegistrations();
		model.addAttribute("registrations",registration);
		return "list_registration";
	}
	
	@RequestMapping("/deleteReg")
	public String deleteRegistration(
			@RequestParam long id,
			Model model
			) {
		registrationService.deleteRegistration(id);
		List<Registration>registration=registrationService.getRegistrations();
		model.addAttribute("registrations",registration);
		return "list_registration";
	}
	
	@RequestMapping("/getRegById")
	public String getRegistrationById(
			@RequestParam long id,
		    Model model
			) {
		Registration registration = registrationService.getRegistration(id);
		model.addAttribute("registration", registration);
		return "update_registration";
	}
	
	@RequestMapping("/updateReg")
	public String updateRegistration(
			RegistrationDto dto,
			Model model
			) {
		registrationService.updateRegistration(dto);
		List<Registration>registration=registrationService.getRegistrations();
		model.addAttribute("registrations",registration);
		return "list_registration";

	}
}

