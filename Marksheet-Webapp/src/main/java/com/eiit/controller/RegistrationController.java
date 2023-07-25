package com.eiit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eiit.model.UserDTO;
import com.eiit.service.RegistrationService;
import com.eiit.validator.RegistrationValidator;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationValidator rejectIfEmpty;
	
	@Autowired
	private RegistrationService registrationService;

	@RequestMapping("/registration")
	public String showLogin(Map<String, Object> map) {
		System.out.println("Inside show registration method");
		UserDTO usr = new UserDTO();
		map.put("Registration", usr);
		return "registration";
	}
	
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public String signInAction1(@ModelAttribute("Registration") UserDTO registration) {
		System.out.println("Inside userRegistrationAction1 method");

		System.out.println("Email >>" + registration.getEmailId());
		System.out.println("Password >>" + registration.getPassword());

	registrationService.userRegistration(registration);
		return "registration";
		
	}
	
	@RequestMapping(value = "/submitRegister", method = RequestMethod.POST)
	public String submitRegister(@ModelAttribute("Registration") UserDTO registration, BindingResult result) {
		System.out.println("Inside RegistrationController >> submitRegister method");

		System.out.println("First Name >> " + registration.getFirstName());
		System.out.println("Last Name >> " + registration.getLastName());
		System.out.println("Email Id >> " + registration.getEmailId());
		System.out.println("Mobile Number >> " + registration.getMobileNumber());
		System.out.println("Password >> " + registration.getPassword());

		rejectIfEmpty.validate(registration, result);

		if (result.hasErrors()) {
			return "registration";
		} else {
			registrationService.userRegistration(registration);
		}
		return "registration";
	}
}

