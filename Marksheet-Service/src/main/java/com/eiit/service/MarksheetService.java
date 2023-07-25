package com.eiit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eiit.model.MarksheetDTO;
import com.eiit.repository.MarksheetRepository;



@Service
public class MarksheetService {
	@Autowired
	private MarksheetRepository marksheetRepository;
	
    public void productRegistration(MarksheetDTO marksheetRegistration) {
    	 
    	 System.out.println("Inside productRegistration method in ProductService ");
 		
    	 System.out.println("Student name in MarksheetController >>" + marksheetRegistration.getStudentName());
 		System.out.println("Total marks in MarksheetController >>" + marksheetRegistration.getTotalMarks());
 		System.out.println("Remarks in MarksheetController >>" + marksheetRegistration.getRemarks());
 		System.out.println("Grade in MarksheetController >>" + marksheetRegistration.getGrade());
 		System.out.println("Roll Number in MarksheetController >>" + marksheetRegistration.getRollNumber());
 		System.out.println("Marksheet ID in MarksheetController >>" + marksheetRegistration.getMarksheetId());
 		marksheetRepository.saveProductDeatils(marksheetRegistration);
     }
    
    public List<MarksheetDTO> getAllProduct(){
    	
    	return marksheetRepository.getAllProduct();
    }
}
