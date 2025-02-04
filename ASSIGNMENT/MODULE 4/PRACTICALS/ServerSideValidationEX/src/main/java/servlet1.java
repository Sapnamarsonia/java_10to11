import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class servlet1 implements Filter { 
  
    public void init(FilterConfig arg0) throws ServletException 
    { 
    } 
  
    public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain)  throws IOException, ServletException 
    { 
  
        PrintWriter out = resp.getWriter(); 
  
        String password = req.getParameter("password"); 
        
        //check password
        if (password.equals("admin")) 
        { 
        	out.println("success");
            chain.doFilter(req, resp); 
        } 
  
        // Password incorrect 
        else 
        { 
            out.print("username or password is wrong"); 
            RequestDispatcher rd 
                = req.getRequestDispatcher("index.jsp"); 
            rd.include(req, resp); 
        } 
    } 
    public void destroy() {} 
}