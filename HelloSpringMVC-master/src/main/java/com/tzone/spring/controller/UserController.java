package com.tzone.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tzone.spring.entity.Student;
import com.tzone.spring.service.StudentService;
import com.tzone.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("UserSpringService")
	private UserService userService;
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/addUser.page")
	public String goToAddUser(HttpServletRequest request, HttpServletResponse response){
		return "addUser";
		
	}
	
	@RequestMapping(value="/addUser.do", method=RequestMethod.POST)
	public String addUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Student student ){             
		
		System.out.println("test-student"+student);
		studentService.saveStudent(student);
		request.setAttribute("mainPageUrl", "/WEB-INF/views/addUser.jsp");
		findAllUsers(request);
		
		return "mainUserPage";
		
	}
	
	@RequestMapping(value="/searchUser.page")
	public String goToSearchUser(HttpServletRequest request, HttpServletResponse response){
		System.out.println("test-1");
		
		
		return "searchUser";
		
	}
	
	@RequestMapping(value="/delete.page")
	public String deleteUser(HttpServletRequest request, HttpServletResponse response ){             
		
		
		int studentID = (Integer) request.getAttribute("studentId");
		studentService.deleteStudent(studentID);
		findAllUsers(request);
		
		return "searchUser";
		
	}
	
	private void findAllUsers(HttpServletRequest request){
		List <Student> studentList;
		try {
			studentList = userService.searchStudent();
			request.setAttribute("students", studentList);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}
