package com.thecoderstv.springcore;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.thecoderstv.springcore.service.StudentService;
import com.thecoderstv.springcore.serviceimpl.StudentServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.thecoderstv.springcore.serviceimpl")
public class Config {

	@Bean("datasource")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root1998");
		return ds;
	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean("studentServiceImpl")
	public StudentService getStudentService() {
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		studentServiceImpl.setJdbcTemplate(getJdbcTemplate());
		return studentServiceImpl;
	}
}
