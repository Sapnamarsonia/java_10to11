package myHttpServleteExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myServletHttp extends HttpServlet
{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
	}

}
