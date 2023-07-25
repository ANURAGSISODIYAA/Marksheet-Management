package com.eiit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eiit.model.UserDTO;
import com.eiit.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public void userSignIn(UserDTO login) {

		System.out.println("Inside userSignIn method >>> loginService ");

		System.out.println("Email Service>>" + login.getEmailId());
		System.out.println("Password  Service>>" + login.getPassword());

		loginRepository.userSaveOperation(login);
	}

}
