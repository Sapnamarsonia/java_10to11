import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/formvalidationfilter")
public class FormValidationFilter implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException 
    {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException 
    {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        // Retrieve data
        String fname = httpRequest.getParameter("fname");
        String lname = httpRequest.getParameter("lname");
        
        // Check empty
        if ( fname != null || lname != null) 
        {
            httpRequest.setAttribute("errorMessage", "All fields must be filled.");
            RequestDispatcher dispatcher = httpRequest.getRequestDispatcher("/response.jsp");
            dispatcher.forward(request, response);
        } 
        else 
        {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }
    
   
}
