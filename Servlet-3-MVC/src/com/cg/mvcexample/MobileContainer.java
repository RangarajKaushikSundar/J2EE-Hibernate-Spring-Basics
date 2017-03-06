package com.cg.mvcexample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MobileContainer extends HttpServlet {

	MobileService ms=new MobileService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher rd=null;
		String uri=req.getRequestURI();
		
		if(uri.endsWith("addMobile.do")){
			rd=req.getRequestDispatcher("addmobile.jsp");
			rd.forward(req, resp);
		}
		else if(uri.endsWith("addNewMobile.do")){
			Mobile mob=new Mobile();
			mob.setMobile_id(Integer.parseInt(req.getParameter("mid")));
			mob.setMobile_name(req.getParameter("mname"));
			mob.setMobile_make(req.getParameter("mmake"));
			mob.setMobile_price(Integer.parseInt(req.getParameter("mprice")));
			ms.addMobile(mob);
			
			rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
		
		else if(uri.endsWith("searchMobile.do")){
			rd=req.getRequestDispatcher("search.jsp");
			rd.forward(req, resp);
		}
		
		else if(uri.endsWith("searchbyprice.do")){
			double price=Double.parseDouble(req.getParameter("price"));
			List<Mobile> result=ms.searchByPrice(price);
			req.setAttribute("result", result);
			rd=req.getRequestDispatcher("searchResult.jsp");
			rd.forward(req, resp);
			
		}
			
		else if(uri.endsWith("display.do")){
			List<Mobile> list=ms.displayMobiles();
			req.setAttribute("list", list);
			rd=req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);
		}
		
	}
	
}
