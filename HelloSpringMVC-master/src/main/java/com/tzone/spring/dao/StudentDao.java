package com.tzone.spring.dao;

import java.util.List;

import com.tzone.spring.entity.Student;

public interface StudentDao {
	
	public List<Student> findAll();
	public void saveStudent(Student student);
	public void deleteStudent(Student student);
	public Student findByIdStudent(int id);
	

}
