import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/login")
public class Servlet1 implements Filter
{
	@Override
	public void init(FilterConfig arg0) throws ServletException 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain )
			throws IOException, ServletException 
	{
		HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;

        // Retrieve parameter
        String username = httpRequest.getParameter("username");
        String password = httpRequest.getParameter("password");

       
        if (isValidUsername(username) && isValidPassword(password)) {
            // If valid, pass the request along the filter chain
            chain.doFilter(req, resp);
        } 
        else 
        {
            // invalid resp
            httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid username or password.");
        }
    }
	 @Override
	    public void destroy() 
	 	{
	        // Cleanup filter if necessary
	    }
	 //method to check
	 private boolean isValidUsername(String username) 
	 {
	        if (username == null || username.trim().isEmpty()) 
	        {
	            return false;
	        }
			return true;
	    }

	    // Validate password (must be at least 8 characters, contain a letter, a number, and a special character)
	    private boolean isValidPassword(String password) 
	    {
	        if (password == null ) 
	        {
	            return false;
	        }
	       return true;
	    }

}

