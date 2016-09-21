package com.tzone.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tzone.spring.dao.StudentDao;
import com.tzone.spring.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	 private SessionFactory sessionFactory;
	 
	 @Autowired
	    public StudentDaoImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }


	 @Override
	 @Transactional
	 public List<Student> findAll() {
	  @SuppressWarnings("unchecked") 
	  List<Student> students = sessionFactory.getCurrentSession().createCriteria(Student.class).list();
	  
	  for(Student s : students){
	   System.out.println("firstname: "+s.getFirstname());
	  }
	  
	  return students;
	 }

	@Override
	 @Transactional
	public void saveStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		
	}
	
	@Override
	 @Transactional
	public void deleteStudent(Student student) {
		sessionFactory.getCurrentSession().delete(student);
	}
	
	@Override
	 @Transactional
	public Student findByIdStudent(int id) {
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, id);
		return student;
	}
	
	



}
