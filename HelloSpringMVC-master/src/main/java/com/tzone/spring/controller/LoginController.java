package com.tzone.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tzone.spring.exception.ApplicationException;
import com.tzone.spring.service.AuthenticationService;
import com.tzone.spring.vo.UserLoginVO;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	@Qualifier("AuthenticationSpringService")
	private AuthenticationService authenticationService;
	
	@RequestMapping(value="/mainLogin.page" , method =RequestMethod.GET)
	public String mainLogin(HttpServletRequest request ,HttpServletResponse response){
		
		return "login";

	}
	
	@RequestMapping(value="/loginUser.do" , method =RequestMethod.POST)
	public String loginUser(@ModelAttribute UserLoginVO user, HttpServletRequest request ,HttpServletResponse response ){
		
		
		System.out.println("Username en metodo login es: " +user.getUsername());
		System.out.println("Password en metodo login es: " +user.getPassword());
		
		String view = "";	
		
		try {
			boolean isValidUser = authenticationService.validarUser(user);
			
			if (isValidUser){
				view = "mainUserPage";
				request.setAttribute("welcomeUSer", user);
			}else{
				view = "login";
				user.setMessage("Ususario y/o password invalido(s)");
				request.setAttribute("userLogin" , user);
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return view;
		
	}

}
