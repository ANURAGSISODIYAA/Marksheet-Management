package com.eiit.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.eiit.model.MarksheetDTO;


@Component
public class MarksheetValidator {

	
	
	public boolean supports(Class<?> claszz) {
		return MarksheetDTO.class.isAssignableFrom(claszz);
	}

	// Rule number-1
	public void validate(Object target, Errors errors) {

//		MarksheetDTO mkr = (MarksheetDTO) target;

		ValidationUtils.rejectIfEmpty(errors, "Student Name", "error.studentName.empty", "Please enter Student Name");
		ValidationUtils.rejectIfEmpty(errors, "REMARKS", "error.remarks.empty", "Please enter REMARKS");
		ValidationUtils.rejectIfEmpty(errors, "totalMarks", "error.totalMarks.empty", "Please enter totalMarks ");
		ValidationUtils.rejectIfEmpty(errors, "rollNumber", "error.rollNumber.empty", "Please enter rollNumber ");
		ValidationUtils.rejectIfEmpty(errors, "grade", "error.grade.empty", "Please enter grade");
		
	}
}
