<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP TAGS AND SCRIPLET</title>
</head>
<body>
	<h1>Items List</h1>

    <%
        // Sample list of items
        List<String> items = Arrays.asList("DEMO 1", "DEMO 2", "DEMO 3");
        request.setAttribute("itemsList", items);
    %>

    <ul>
        <c:forEach var="item" items="${itemsList}">
            <li>${item}</li>
        </c:forEach>
    </ul>

    <h2>Scriptlet Example</h2>
    <%
        // Scriptlet to display a message
        String message = "Hello!";
        out.println("<p>" + message + "</p>");
    %>

    <h2>Accessing Implicit Objects</h2>
    <p>Request URI: <%= request.getRequestURI() %></p>
    <p>Context Path: <%= request.getContextPath() %></p>
    <p>Session ID: <%= session.getId() %></p>
    <p>Server Name: <%= application.getServerInfo() %></p>

</body>
</html>