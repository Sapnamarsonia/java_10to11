package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ServletA extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        ServletContext context = getServletContext();
        
        String Data = context.getInitParameter("Data");
        response.setContentType("text/html");
       
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h2>ServletA</h2>");
        response.getWriter().write("<p> Data: " + Data + "</p>");
        response.getWriter().write("</body></html>");
    }
}
