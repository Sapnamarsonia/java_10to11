<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
    <form action="RegisterServlet" method="post">
        <label for="username">Username: </label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="email">Email: </label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password: </label>
        <input type="password" id="password" name="password" required><br><br>

        <label for="phone">Phone: </label>
        <input type="text" id="phone" name="phone" required><br><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>
