import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	// Get username and password 
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123".equals(password)) 
        {
            // Successful login
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);

            // Optionally, store a cookie to remember the user
            if ("on".equals(request.getParameter("rememberMe"))) 
            {
                Cookie usernameCookie = new Cookie("username", username);
                usernameCookie.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(usernameCookie);
            }

            // Redirect to a welcome page after login
            response.sendRedirect("welcome.jsp");
        } 
           else 
	        {
	            // login fail
	            response.sendRedirect("login.jsp?error=Invalid details");
	        }
    }
}