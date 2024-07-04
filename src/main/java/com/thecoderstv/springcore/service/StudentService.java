package com.thecoderstv.springcore.service;

import java.util.List;

import com.thecoderstv.springcore.dao.Student;

public interface StudentService {
	public int saveStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
}
