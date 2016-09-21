package com.tzone.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tzone.spring.dao.StudentDao;
import com.tzone.spring.entity.Student;
import com.tzone.spring.service.StudentService;
@Service("StudentSpringService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudent() {
		List<Student> studentList = studentDao.findAll();
		
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		Student student = studentDao.findByIdStudent(id);
		studentDao.deleteStudent(student);
		
	}

}
