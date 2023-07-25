package com.eiit.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.eiit.model.UserDTO;

@Component
public class LoginValidator implements Validator {

	public boolean supports(Class<?> claszz) {
		return UserDTO.class.isAssignableFrom(claszz);
	}
	
	public void validate(Object target, Errors errors) {

		UserDTO usr = (UserDTO) target;

		ValidationUtils.rejectIfEmpty(errors, "emailId", "error.emailId.empty", "Please enter Email ");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty", "Please enter password");

		
		if (usr.getEmailId() != null && usr.getEmailId().trim().length() > 0) {
			if (usr.getEmailId().contains("@gmail.com") != true) {
				errors.rejectValue("emailId", "error.email.first.rule", "Email must contain @ symbol");
			}
		}
		
		if (usr.getPassword() != null && usr.getPassword().trim().length() > 0) {
			String password = usr.getPassword();
			if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")) {
				errors.rejectValue("password", "error.password.first.rule",
						"Password should include at least one numeric, one capital letter, one small letter, and one special character and it should be of 8 charachter.");
			}
		}
	}
}
