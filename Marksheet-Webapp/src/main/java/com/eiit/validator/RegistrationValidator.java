
package com.eiit.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.eiit.model.UserDTO;
import com.eiit.repository.RegistrationRepository;

@Component
public class RegistrationValidator implements Validator {
  
	@Autowired
	private RegistrationRepository regRepo;
	
	public boolean supports(Class<?> claszz) {
		return UserDTO.class.isAssignableFrom(claszz);
	}

	// Rule number-1
	public void validate(Object target, Errors errors) {

		UserDTO usr = (UserDTO) target;

		ValidationUtils.rejectIfEmpty(errors, "firstName", "error.firstName.empty", "Please enter First Name");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "error.lastName.empty", "Please enter last Name");
		ValidationUtils.rejectIfEmpty(errors, "emailId", "error.emailId.empty", "Please enter Email ");
		ValidationUtils.rejectIfEmpty(errors, "mobileNumber", "error.mobileNumber.empty", "Please enter mobileNumber ");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty", "Please enter password");

		// Rule number-2

		// for first name
		if (usr.getFirstName() != null && usr.getFirstName().trim().length() > 0) {
			if (usr.getFirstName().length() < 8 != true) {
				errors.rejectValue("firstName", "error.firstName.first.rule",
						"First name should be less than 8 letters");
			}
		}

		// for last name
		if (usr.getLastName() != null && usr.getLastName().trim().length() > 0) {
			if (usr.getLastName().length() < 8 != true) {
				errors.rejectValue("lastName", "error.lastName.first.rule",
						"LastName name should be less than 8 letters");
			}
		}

		// for emailID
		if (usr.getEmailId() != null && usr.getEmailId().trim().length() > 0) {
			if (usr.getEmailId().contains("@gmail.com") != true) {
				errors.rejectValue("emailId", "error.email.first.rule", "Email must contain @ symbol");
			}
		}

		// for mobile numbers
		if (usr.getMobileNumber() != null && Long.toString(usr.getMobileNumber()).trim().length() > 0) {
			String mobileNumber = Long.toString(usr.getMobileNumber());
			if (mobileNumber.length() != 10 || !mobileNumber.matches("^[0-9]*$")) {
				errors.rejectValue("mobileNumber", "error.mobileNumber.first.rule",
						"Mobile number should be exactly 10 digits and should not contain any alpha numeric characters.");
			}
		}

		// for password
		if (usr.getPassword() != null && usr.getPassword().trim().length() > 0) {
			String password = usr.getPassword();
			if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")) {
				errors.rejectValue("password", "error.password.first.rule",
						"Password should include at least one numeric, one capital letter, one small letter, and one special character and it should be of 8 charachter.");
			}
		}
		
		
		// Rule number - 3
		
		
		/*
		 * UserDTO email = regRepo.findByEmail(usr.getEmailId()); if (email != null ) {
		 * errors.rejectValue("emailId", "error.email.3.rule", "Email already exists");
		 * }
		 */
		 
	}
	
}
