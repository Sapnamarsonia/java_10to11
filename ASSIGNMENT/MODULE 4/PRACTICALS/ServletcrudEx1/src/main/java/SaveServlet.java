import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class SaveServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String country = req.getParameter("country");
		
		
		Model m = new Model();
		m.setName(name);
		m.setSurname(surname);
		m.setEmail(email);
		m.setCountry(country);
		
		int status = Dao.savedata(m);
		
		if (status>0)
		{
			resp.sendRedirect("viewservlet");		
		}
		else
		{
			out.print("Fail");
		}

}
}