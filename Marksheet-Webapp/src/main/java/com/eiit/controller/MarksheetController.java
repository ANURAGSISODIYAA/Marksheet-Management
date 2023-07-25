package com.eiit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eiit.model.MarksheetDTO;
import com.eiit.service.MarksheetService;
import com.eiit.validator.MarksheetValidator;


@Controller
public class MarksheetController {

	@Autowired
	private MarksheetValidator rejectIfEmpty;

	@Autowired
	private MarksheetService marksheetService;

	@RequestMapping("/marksheet")
	public String showEntry(Model model) {
		System.out.println("Inside showEntry method in ProductController");
		MarksheetDTO mk = new MarksheetDTO();
		model.addAttribute("Mk", mk);
		
		 List<MarksheetDTO> marksheetList=marksheetService.getAllProduct();
		 model.addAttribute("marksheetList", marksheetList);
		 
			for (int counter = 0; counter < marksheetList.size(); counter++) {
				// System.out.println(login1.get(counter));
				System.out.println("Student name in productRepository >>" + marksheetList.get(counter).getStudentName());
				System.out.println("Product price in productRepository >>" + marksheetList.get(counter).getTotalMarks());
				System.out.println("Product description in productRepository >>" + marksheetList.get(counter).getRemarks());
				System.out.println("Product expireDate in productRepository >>" + marksheetList.get(counter).getGrade());
				System.out.println("Product code in productRepository >>" + marksheetList.get(counter).getRollNumber());
				System.out.println("Product id in productRepository >>" + marksheetList.get(counter).getMarksheetId());
			}
		return "marksheet";
	}

	

	@RequestMapping(value = "/submitMarksheet", method = RequestMethod.POST)
	public String submitRegister(@ModelAttribute("Mk") MarksheetDTO marksheetRegistration, BindingResult result, Model model) {
		System.out.println("Inside RegistrationController >> submitRegister method");

		System.out.println("Student name in MarksheetController >>" + marksheetRegistration.getStudentName());
		System.out.println("Total marks in MarksheetController >>" + marksheetRegistration.getTotalMarks());
		System.out.println("Remarks in MarksheetController >>" + marksheetRegistration.getRemarks());
		System.out.println("Grade in MarksheetController >>" + marksheetRegistration.getGrade());
		System.out.println("Roll Number in MarksheetController >>" + marksheetRegistration.getRollNumber());
		System.out.println("Marksheet ID in MarksheetController >>" + marksheetRegistration.getMarksheetId());

		rejectIfEmpty.validate(marksheetRegistration, result);

		if (result.hasErrors()) {
			return "marksheet";
		} else {
			 marksheetService.productRegistration(marksheetRegistration);
		} 
			 List<MarksheetDTO> marksheetList=marksheetService.getAllProduct();
			 model.addAttribute("marksheetList", marksheetList);
			 
				for (int counter = 0; counter < marksheetList.size(); counter++) {
					// System.out.println(login1.get(counter));
					System.out.println("Student name in productRepository >>" + marksheetList.get(counter).getStudentName());
					System.out.println("Product price in productRepository >>" + marksheetList.get(counter).getTotalMarks());
					System.out.println("Product description in productRepository >>" + marksheetList.get(counter).getRemarks());
					System.out.println("Product expireDate in productRepository >>" + marksheetList.get(counter).getGrade());
					System.out.println("Product code in productRepository >>" + marksheetList.get(counter).getRollNumber());
					System.out.println("Product id in productRepository >>" + marksheetList.get(counter).getMarksheetId());
			 
			 
		}
		return "marksheet";
	  }
		
	}
	


	
	
	
	/*
	 * @RequestMapping(value = "/marksheetRegistration", method =
	 * RequestMethod.POST) public String entryAction1(@ModelAttribute("Mk")
	 * MarksheetDTO marksheetRegistration,Map<String, Object> map,Model model) {
	 * System.out.
	 * println("Inside productRegistrationAction1 method in ProductController");
	 * 
	 * System.out.println("Student name in MarksheetController >>" +
	 * marksheetRegistration.getStudentName());
	 * System.out.println("Total marks in MarksheetController >>" +
	 * marksheetRegistration.getTotalMarks());
	 * System.out.println("Remarks in MarksheetController >>" +
	 * marksheetRegistration.getRemarks());
	 * System.out.println("Grade in MarksheetController >>" +
	 * marksheetRegistration.getGrade());
	 * System.out.println("Roll Number in MarksheetController >>" +
	 * marksheetRegistration.getRollNumber());
	 * System.out.println("Marksheet ID in MarksheetController >>" +
	 * marksheetRegistration.getMarksheetId());
	 * 
	 * marksheetService.productRegistration(marksheetRegistration);
	 * 
	 * 
	 * 
	 * List<MarksheetDTO> productList=marksheetService.getAllProduct();
	 * model.addAttribute("List", productList);
	 * 
	 * for (int counter = 0; counter < productList.size(); counter++) { //
	 * System.out.println(login1.get(counter));
	 * System.out.println("Product name in productList >>" +
	 * productList.get(counter).getProductName());
	 * System.out.println("Product price in productList >>" +
	 * productList.get(counter).getPrice());
	 * System.out.println("Product description in productList >>" +
	 * productList.get(counter).getDescription());
	 * System.out.println("Product expireDate in productList >>" +
	 * productList.get(counter).getExpireDate());
	 * System.out.println("Product code in productList >>" +
	 * productList.get(counter).getProductCode());
	 * System.out.println("Product id in productList >>" +
	 * productList.get(counter).getProductId()); }
	 * 
	 * return "marksheet"; }
	 */