package com.cg.mvc3;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloExample {
		@RequestMapping("/hello")
		public ModelAndView getMessage(){
			String message="Hi! please Welcome to :"+new Date();
			return new ModelAndView("viewMessage","message",message);
		}
		@RequestMapping({"/home","/welcome"})
		public String home(){
			return "home";
		}
}
