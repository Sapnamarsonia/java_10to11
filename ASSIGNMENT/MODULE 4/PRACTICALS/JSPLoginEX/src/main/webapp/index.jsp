<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>

	<h2>Login Form</h2>
    <form action="LoginServlet" method="POST">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required/><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required/><br><br>

        <input type="submit" value="Login"/>
    </form>

</body>
</html>