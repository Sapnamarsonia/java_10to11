<%@page import="com.dao.Dao"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="com.model.Model"/>    
<jsp:setProperty property="*" name="m"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
	
		int data = Dao.insertdata(m);
	
		//out.println("DAO" + data);
	
		if(data>0)
		{
			response.sendRedirect("index.jsp");
			out.print("<p>Data Submitted Succcessfully!</p>");
		}
		else
		{ 
	%>

	
	<center>
		<h1 style="color: red;">Fail</h1>
	</center>
	
	<%@include file ="index.jsp" %> 
	
	<% 
		}
	
	%>
	

</body>
</html>