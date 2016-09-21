package com.tzone.spring.service;

import java.util.List;

import com.tzone.spring.entity.Student;
import com.tzone.spring.exception.ApplicationException;

public interface UserService {
	
	void addUser(Student student) throws ApplicationException;
	List<Student> searchStudent() throws ApplicationException;
	
}
