<%@ page import="javax.servlet.http.*" %>
<%
    // Invalidate session
    HttpSession Session = request.getSession(false);
    if (session != null) {
        session.invalidate();  // Remove user from session
    }

    // Delete cookies if they exist
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                cookie.setMaxAge(0);  // Expire the cookie
                response.addCookie(cookie);
            }
        }
    }

    // Redirect to login page after logout
    response.sendRedirect("index.jsp");
%>
