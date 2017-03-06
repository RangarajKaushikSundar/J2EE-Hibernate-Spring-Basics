package com.cg.mvcexample;

import java.sql.Connection;
import java.sql.DriverManager;

public class MobileDaoUtil {
	
	Connection con;
	
	public Connection getConnection(){
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KAUSHIK","PASS1234");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
