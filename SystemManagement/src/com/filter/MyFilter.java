package com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;



public class MyFilter extends StrutsPrepareAndExecuteFilter implements javax.servlet.Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request2=(HttpServletRequest) request;
		HttpServletResponse response2=(HttpServletResponse) response;
		HttpSession session=request2.getSession();
		String head=request2.getRequestURI();

	//System.out.println("in");
	//System.out.println(session.getAttribute("admin"));
		if(head.endsWith(".jsp")||head.endsWith(".action"))
		{
	if(session.getAttribute("admin")==null&&!head.endsWith("loginin.action"))
	{
		//	request.getRequestDispatcher(path)
	response2.sendRedirect("/SystemManagement/");
		
		//request.getRequestDispatcher("/SystemManagement/").forward(request, response);
		//System.out.println("notnull");
	}
		}
		//System.out.println(head);
chain.doFilter(request2, response2);
		
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}



}
