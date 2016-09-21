package com.tzone.spring.service;

import java.util.List;

import com.tzone.spring.entity.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	public void saveStudent(Student student);
	public void deleteStudent(int id);

}
