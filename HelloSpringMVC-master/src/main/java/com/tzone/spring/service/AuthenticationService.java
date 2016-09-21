package com.tzone.spring.service;

import com.tzone.spring.exception.ApplicationException;
import com.tzone.spring.vo.UserLoginVO;

public interface AuthenticationService  {
	boolean validarUser(UserLoginVO user) throws ApplicationException;
}
