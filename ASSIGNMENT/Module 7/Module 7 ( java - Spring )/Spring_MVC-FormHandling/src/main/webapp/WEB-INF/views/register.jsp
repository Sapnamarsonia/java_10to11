<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register</h2>
<form:form modelAttribute="user" action="register" method="post">
    Name: <form:input path="name"/> <form:errors path="name"/><br/>
    Email: <form:input path="email"/> <form:errors path="email"/><br/>
    Password: <form:password path="password"/> <form:errors path="password"/><br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>