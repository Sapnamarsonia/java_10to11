import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInputServlet")
public class UserInputServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user input from the form
        String userName = request.getParameter("name");

        // Set the content type to HTML
        response.setContentType("text/html");

        // Write the response
        PrintWriter out = response.getWriter();

      
        out.println("Hello, " + userName + " !");
       
        out.println("Your name has been submitted successfully.");
       
	}
}