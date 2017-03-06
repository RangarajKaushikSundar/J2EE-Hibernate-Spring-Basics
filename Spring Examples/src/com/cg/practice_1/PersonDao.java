package com.cg.practice_1;


import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Person> getNames(){
	    List<Person> list = jdbcTemplate.query("select * from person where city like '%Chennai%'", new BeanPropertyRowMapper<Person>(Person.class));
		return list;
	}
	public int getCount(){
		int count=jdbcTemplate.queryForInt("select count(*) from person");
		return count;
		
	}
}
