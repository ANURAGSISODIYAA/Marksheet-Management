package com.eiit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.eiit.model.UserDTO;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static final Logger Log = Logger.getLogger("LoggingInterceptor.class");
	long currentTimeMillis;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		currentTimeMillis = 0;
		System.out.println("Login Interceptor - This is prehandel");
		currentTimeMillis = System.currentTimeMillis();

		UserDTO login = (UserDTO) request.getSession().getAttribute("login");
		if (login == null || login.equals(" ")) {
			response.sendRedirect("login.do");
			return false;
		}
         Log.info("This is prehandel");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("Login Interceptor - This is posthandel");
		long finaltTimeMillis = System.currentTimeMillis();
		System.out.println("Total Time = " + (finaltTimeMillis - currentTimeMillis));
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Login Interceptor - This is After Completion");

	}
}
