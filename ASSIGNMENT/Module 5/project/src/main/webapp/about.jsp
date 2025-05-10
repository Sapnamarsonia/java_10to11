<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us - Toys App</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
    }

   header {
        background-color: #ff6f61;
        color: white;
        padding: 20px;
        text-align: center;
    }
    nav {
        background-color: #fff;
        padding: 10px;
        text-align: center;
        box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
    }

    nav a {
        text-decoration: none;
        color: #333;
        margin: 0 15px;
        font-weight: bold;
    }

    .container {
        max-width: 800px;
        margin: 40px auto;
        padding: 20px;
        background-color: white;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
        color: #ff6f61;
    }

    ul {
        list-style: none;
        padding-left: 0;
    }

    ul li::before {
        content: " ";
        color: #ff6f61;
        font-weight: bold;
    }

    footer {
        text-align: center;
        padding: 20px;
        background-color: #eee;
        margin-top: 40px;
        color: #666;
    }
</style>
</head>
<body>
	<jsp:include page="header.jsp"/>

    <div class="container">
    
        <h1>Toys App</h1>
        <p>Your one-stop shop for fun, safe, and educational toys!</p>
        <h2>About Us</h2>
        <p>
            <strong>Toys App</strong> is dedicated to making playtime magical and meaningful. We provide a wide selection of toys that are safe, fun, and help kids learn and grow.
        </p>
        <p>
            Since our launch in 2022, we've helped thousands of families find the perfect toys for every occasion, from birthdays to holidays and everything in between.
        </p>

        <h3>Why Choose Us?</h3>
        <ul>
            <li>Quality and  Safety First</li>
            <li>Wide Range of Toys for All Ages</li>
            <li>Educational and Developmental Focus</li>
            <li>Friendly Customer Support</li>
        </ul>

        <h3>Contact Us</h3>
        <p>Want to know more? <a href="contact.jsp">Reach out to us </a> we are happy to help!</p>
    </div>

    <footer>
        &copy; 2025 Toys App. All rights reserved.
    </footer>
	<jsp:include page="footer.jsp"/>

</body>
</html>
