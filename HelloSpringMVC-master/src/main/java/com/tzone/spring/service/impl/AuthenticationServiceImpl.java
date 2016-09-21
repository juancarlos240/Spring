package com.tzone.spring.service.impl;

import org.springframework.stereotype.Service;

import com.tzone.spring.exception.ApplicationException;
import com.tzone.spring.service.AuthenticationService;
import com.tzone.spring.vo.UserLoginVO;
@Service("AuthenticationSpringService")
public class AuthenticationServiceImpl implements AuthenticationService {

	@Override
	public boolean validarUser(UserLoginVO user) throws ApplicationException {
		System.out.println("Username en service es: " +user.getUsername());
		System.out.println("Password en Service es: " + user.getPassword());
		
		boolean isValid = false;
		if (user.getUsername().equals("admin") && user.getPassword().equals("admin")){
			isValid = true;
		}
		System.out.println("isValid en ServiImpl es: " +isValid);
		return isValid;
	}

}

