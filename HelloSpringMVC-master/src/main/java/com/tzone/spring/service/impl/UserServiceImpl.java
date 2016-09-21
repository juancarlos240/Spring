package com.tzone.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tzone.spring.dao.StudentDao;
import com.tzone.spring.entity.Student;
import com.tzone.spring.exception.ApplicationException;
import com.tzone.spring.service.UserService;

@Service("UserSpringService")
public class UserServiceImpl implements UserService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void addUser(Student student) throws ApplicationException {
		System.out.println("First name: " +student.getFirstname());
		System.out.println("Last name: " +student.getLastname());
		System.out.println("Phone: " +student.getPhone());
		System.out.println("Salary: " +student.getSalary());
		
	}

	@Override
	public List<Student> searchStudent() throws ApplicationException {
		
		List<Student> studentList = studentDao.findAll();
//		
//		List<Student> studentList = new ArrayList<Student>();
//		Student s1 = new Student();
//		s1.setId(1);
//		s1.setFirstname("Giovanni");
//		s1.setLastname("Rodriguez");
//		s1.setPhone("123456");
//		s1.setSalary(456780.00);
//		studentList.add(s1);
//		
//		Student s2 = new Student();
//		s2.setId(2);
//		s2.setFirstname("Giovanni");
//		s2.setLastname("Rodriguez");
//		s2.setPhone("123456");
//		s2.setSalary(456780.00);
//		studentList.add(s2);
//		
//		Student s3 = new Student();
//		s3.setId(3);
//		s3.setFirstname("Giovanni");
//		s3.setLastname("Rodriguez");
//		s3.setPhone("123456");
//		s3.setSalary(456780.00);
//		studentList.add(s3);
//		
//		Student s4 = new Student();
//		s4.setId(4);
//		s4.setFirstname("Giovanni");
//		s4.setLastname("Rodriguez");
//		s4.setPhone("123456");
//		s4.setSalary(456780.00);
//		studentList.add(s4);
		
		return studentList;
	}
	

}
