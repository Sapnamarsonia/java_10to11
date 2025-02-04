import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");

		Model m = new Model();
		m.setuname(uname);
		m.setpass(pass);
		
		Model m2 = Dao.logindata(m);
		
		if(m2!=null)
		{
			out.print("Login Success");
		}
		else
		{
			out.print("Login Fail");
		}
		
		
		
	}

}
