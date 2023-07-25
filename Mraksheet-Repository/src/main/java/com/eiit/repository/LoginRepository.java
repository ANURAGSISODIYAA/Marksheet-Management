package com.eiit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.eiit.model.UserDTO;



@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void userSaveOperation(UserDTO login) {

		System.out.println("Inside userSaveOperation method >>> loginRepo ");

		System.out.println("Email Repo>>" + login.getEmailId());
		System.out.println("Password  Repo>>" + login.getPassword());


	
	}
}
