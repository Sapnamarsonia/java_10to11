<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<jsp:include page="./templates/header.jsp" />

<body>

<%
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	out.print(id2);
	Dao.deletedata(id2);
	response.sendRedirect("index.jsp");
	
	
%>
	

</body>
</html>