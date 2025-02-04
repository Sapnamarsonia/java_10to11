import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if ("admin".equals(username) && "admin123".equals(password)) 
		{
	            // Valid login: forward to welcome page
	            RequestDispatcher dispatcher = req.getRequestDispatcher("welcome.jsp");
	            dispatcher.forward(req, resp);
	     } 
		else 
	     {		 // Invalid login
	            req.setAttribute("errorMessage", "Invalid username or password.");
	            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
	            dispatcher.forward(req, resp);
	      }
	}
}
