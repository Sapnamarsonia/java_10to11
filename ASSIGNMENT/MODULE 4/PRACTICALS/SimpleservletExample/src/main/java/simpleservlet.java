import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInput")
public class simpleservlet extends HttpServlet
{
	// using post method to handle get request
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		//set response type
		resp.setContentType("Text/html");
		
        PrintWriter out = resp.getWriter();
        
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        
        if (name != null && age != null) {
            out.println("Hello, " + name + "! You are " + age + " years old.</p>");
        } else 
        {
            out.println("Please provide your name and age.");
        }

	}
}
