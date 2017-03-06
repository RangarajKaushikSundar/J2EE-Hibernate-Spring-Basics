package com.cg.servlet3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewFrineds")
public class ViewFrineds extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> list=new ArrayList<String>();
		list.add("Rajesh");
		list.add("Krish");
		list.add("java");
		HttpSession session=request.getSession();
		session.setAttribute("list", list);
		request.setAttribute("list","RajeshBabu");
		request.setAttribute("date", new Date());
		RequestDispatcher rd=request.getRequestDispatcher("viewFriends.jsp");
		rd.forward(request, response);
		
	}

}
