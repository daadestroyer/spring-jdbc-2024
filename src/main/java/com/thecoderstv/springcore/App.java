package com.thecoderstv.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thecoderstv.springcore.dao.Student;
import com.thecoderstv.springcore.service.StudentService;
import com.thecoderstv.springcore.serviceimpl.StudentServiceImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentService studentService = context.getBean("studentServiceImpl", StudentService.class);
		
		// insert records
		/*
		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Ramesh Nigam");
		student1.setCity("Kanpur");
		int res = studentService.saveStudent(student1);
		if(res > 0) {
			System.out.println("record inserted");
		}
		else {
			System.out.println("record not inserted");
		}
		*/
		
		// update records
		/*
		Student student = new Student();
		student.setId(101);
		student.setName("Shubham Nigam");
		student.setCity("Kanpur");;
		int res = studentService.updateStudent(student);
		if(res > 0) {
			System.out.println("records updated");
		}
		else {
			System.out.println("records not updated");
		}
		*/
		
		// delete records
		int res = studentService.deleteStudent(102);
		if(res > 0) {
			System.out.println("records deleted");
		}
		else {
			System.out.println("records not deleted");
		}
	}
}
