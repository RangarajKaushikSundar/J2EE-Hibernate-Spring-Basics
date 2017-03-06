package com.cg.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CountHtmlHits implements Filter {
	ServletContext context;
	Integer count=0;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		context=filterConfig.getServletContext();
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Filters message");
		count=(Integer) context.getAttribute("count");
		if(count==null){
			int no=1;
			context.setAttribute("count", new Integer(no));
		}
		else{
			int no=count.intValue();
			no++;
			context.setAttribute("count", new Integer(no));
		}
		System.out.println(((HttpServletRequest)request).getRequestURI());
		System.out.println(request.getParameterNames());
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
