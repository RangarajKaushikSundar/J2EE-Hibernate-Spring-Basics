package com.cg.mvc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoUtil {
		private Connection con;
		public Connection getConnection(){
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","NAVEEN","NAVEEN");
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		return con;
		}
		public void close(ResultSet rs, Statement st, Connection con2) {
			try{
			if(rs!=null && st!=null && con2!=null){
				
				rs.close();
				st.close();
				con2.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
