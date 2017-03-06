package com.cg.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MathController extends MultiActionController {
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
				
		 return new ModelAndView("home");
	}
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		
		 return new ModelAndView("view","message","add method is called");
	}
	public ModelAndView sub(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		 return new ModelAndView("view","message","Sub method is called");
	}
	public ModelAndView mul(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		 return new ModelAndView("view","message","mul method is called");
	}
	
	public ModelAndView viewDetails(HttpServletRequest request,HttpServletResponse response,User user)throws ServletException,IOException{
		
		 return new ModelAndView("viewDetails","user",user);
	}
	
}
