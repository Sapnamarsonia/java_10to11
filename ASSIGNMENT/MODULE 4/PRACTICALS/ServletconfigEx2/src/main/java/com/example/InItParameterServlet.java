package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InItParameterServlet extends HttpServlet
{
	String param1;
    String param2;
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		
		// TODO Auto-generated method stub
		super.init();
		param1 = config.getInitParameter("param1");
        param2 = config.getInitParameter("param2");
    }

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
 {
     
     
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();

     out.println("<html><body>");
     out.println("<h1>Initialization Parameters</h1>");
     out.println("<p>Param1: " + param1 );

 }
}
