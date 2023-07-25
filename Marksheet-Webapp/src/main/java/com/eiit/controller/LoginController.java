package com.eiit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eiit.model.MarksheetDTO;
import com.eiit.model.UserDTO;
import com.eiit.service.LoginService;
import com.eiit.validator.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	private LoginValidator rejectIfEmpty;

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public String showLogin(Map<String, Object> map) {
		System.out.println("Inside show login method");
		UserDTO usr = new UserDTO();
		map.put("UserDTO", usr);
		return "login";
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public String submitLogin1(@ModelAttribute("UserDTO") UserDTO login, BindingResult result, ModelMap model,
			HttpServletRequest request) {
		System.out.println("Inside LoginController >> sumbmitogin method");

		System.out.println("Email Id >> " + login.getEmailId());
		System.out.println("Password >> " + login.getPassword());

		rejectIfEmpty.validate(login, result);

		if (result.hasErrors()) {
			return "login";
		} else {
			loginService.userSignIn(login);
			HttpSession session = request.getSession();
			session.setAttribute("userLogin", login);
			MarksheetDTO mk1 = new MarksheetDTO();
			model.addAttribute("Mk", mk1);
		}
		return "marksheet";
	}
}
