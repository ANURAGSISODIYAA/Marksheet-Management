package com.eiit.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.eiit.model.MarksheetDTO;


@Repository
public class MarksheetRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public MarksheetDTO saveProductDeatils(MarksheetDTO marksheetRegistration) {
		if (marksheetRegistration != null) {
			hibernateTemplate.saveOrUpdate(marksheetRegistration);

			System.out.println("Inside saveProductDetails method in productRepository ");


	    	 System.out.println("Student name in MarksheetController >>" + marksheetRegistration.getStudentName());
	 		System.out.println("Total marks in MarksheetController >>" + marksheetRegistration.getTotalMarks());
	 		System.out.println("Remarks in MarksheetController >>" + marksheetRegistration.getRemarks());
	 		System.out.println("Grade in MarksheetController >>" + marksheetRegistration.getGrade());
	 		System.out.println("Roll Number in MarksheetController >>" + marksheetRegistration.getRollNumber());
	 		System.out.println("Marksheet ID in MarksheetController >>" + marksheetRegistration.getMarksheetId());
			return marksheetRegistration;
		} else {
			return null;
		}
	}

	public List<MarksheetDTO> getAllProduct() {

		List<MarksheetDTO> marksheet = (List<MarksheetDTO>) hibernateTemplate.find("from MarksheetDTO");
		System.out.println("Inside getAllProduct method in MarksheetRepository ");
		for (int counter = 0; counter < marksheet.size(); counter++) {
			// System.out.println(login1.get(counter));
			System.out.println("Product name in productRepository >>" + marksheet.get(counter).getStudentName());
			System.out.println("Product price in productRepository >>" + marksheet.get(counter).getTotalMarks());
			System.out.println("Product description in productRepository >>" + marksheet.get(counter).getRemarks());
			System.out.println("Product expireDate in productRepository >>" + marksheet.get(counter).getGrade());
			System.out.println("Product code in productRepository >>" + marksheet.get(counter).getRollNumber());
			System.out.println("Product id in productRepository >>" + marksheet.get(counter).getMarksheetId());
		}

		return marksheet;

	}
}
