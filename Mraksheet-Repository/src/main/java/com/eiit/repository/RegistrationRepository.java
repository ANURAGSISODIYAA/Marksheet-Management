package com.eiit.repository;

import java.util.ArrayList;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.eiit.model.UserDTO;



@Repository
public class RegistrationRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public UserDTO saveUserDeatils(UserDTO registration) {
		if (registration != null) {
			hibernateTemplate.saveOrUpdate(registration);

			System.out.println("Inside saveUserOperation method >>> registrationRepo ");

			System.out.println("Email Repo>>" + registration.getEmailId());
			System.out.println("Password  Repo>>" + registration.getPassword());
			 System.out.println("FirstName Repo>>" + registration.getFirstName()); 
			System.out.println("LastName  Repo>>" + registration.getLastName());
			System.out.println("MobileName  Repo>>" + registration.getMobileNumber());

			return registration;
		} else {
			return null;
		}
	}

		
	/*
	 * public UserDTO findByEmail(String emailId) {
	 * 
	 * ArrayList<UserDTO> registration1 = (ArrayList<UserDTO>)
	 * hibernateTemplate.find("from UserDto al where al.emailId = ? ", emailId );
	 * for (int counter = 0; counter <= registration1.size(); counter++) {
	 * System.out.println(registration1.get(counter)); }
	 * System.out.println(registration1.get(0)); return registration1.isEmpty() ?
	 * null : registration1.get(0); }
	 * 
	 * 
	 * 
	 * public UserDTO findByPassword(Long password) { ArrayList<UserDTO>
	 * registration2 = (ArrayList<UserDTO>)
	 * hibernateTemplate.find("from UserDto al where al.passowrd = ? ", password);
	 * for (int counter = 0; counter <= registration2.size(); counter++) {
	 * System.out.println(registration2.get(counter)); }
	 * System.out.println(registration2.get(0)); return registration2.isEmpty() ?
	 * null : registration2.get(0); }
	 */
	
	 
}
