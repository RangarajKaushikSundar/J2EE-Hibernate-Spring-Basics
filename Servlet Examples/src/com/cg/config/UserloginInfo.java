package com.cg.config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserloginInfo implements Filter {
	Connection con;
	PreparedStatement pst;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","NAVEEN","NAVEEN");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("_____________");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Date d=new Date();
		try {
			pst=con.prepareStatement("insert into u_info values(?,?,?)");
			pst.setString(1, email);
			pst.setString(2, password);
			pst.setString(3, d.toString());
			pst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		chain.doFilter(request, response);
		System.out.println("______________filter back to response_________");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
