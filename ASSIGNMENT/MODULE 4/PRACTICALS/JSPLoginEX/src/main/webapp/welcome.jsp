<%@ page import="javax.servlet.http.*, java.util.*" %>
<%
    // Get session object 
    HttpSession Session = request.getSession(false);
    if (session == null || session.getAttribute("username") == null) {
        response.sendRedirect("login.jsp"); // Redirect to login
    }
    String username = (String) session.getAttribute("username");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Welcome, <%= username %></h2>
    <a href="logout.jsp">Logout</a>
</body>
</html>