package com.cg.dbconnection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class DbConnection {
			private JdbcTemplate jdbcTemplate;

			public JdbcTemplate getJdbcTemplate() {
				return jdbcTemplate;
			}

			public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
				this.jdbcTemplate = jdbcTemplate;
			}

			public int getCount(){
				List<String> list=new ArrayList<String>();
				int count=jdbcTemplate.queryForInt("select count(*) from emp");
				return count;
				
			}
}
