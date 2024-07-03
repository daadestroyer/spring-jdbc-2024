package com.thecoderstv.springcore.service;

import com.thecoderstv.springcore.dao.Student;

public interface StudentService {
	public int saveStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(int id);
}
