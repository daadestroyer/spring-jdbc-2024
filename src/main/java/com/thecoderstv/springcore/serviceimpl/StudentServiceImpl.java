package com.thecoderstv.springcore.serviceimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thecoderstv.springcore.dao.Student;
import com.thecoderstv.springcore.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private JdbcTemplate jdbcTemplate;
	
	public int saveStudent(Student student) {
		String query = "insert into student (id,name,city) values (?,?,?)";
		int res = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}

	public int updateStudent(Student student) {
		String query = "update student set name = ? , city = ? where id = ?";
		int res = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}
	
	public int deleteStudent(int id) {
		String query = "delete from student where id = ?";
		int res = jdbcTemplate.update(query,id);
		return res;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
	
	 

}
