<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>TOYZWIN</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
    <style>
        /* General reset and body styling */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        /* Header and navigation styling */
        header {
            background: linear-gradient(90deg, #f39c12, #f2db18);
            padding: 10px 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        nav {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        /* Logo styling (positioned on the left) */
        .logo a {
         	font-family: "Sofia", sans-serif;
  			font-size: 30px;
 			 text-shadow: 3px 3px 3px #ababab;
            color: green; /* White color for the logo */
            font-size: 36px;
            text-decoration: none;
            font-weight: bold;
            letter-spacing: 2px;
            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
            transition: all 0.3s;
            
        }
        .logo a:hover {
            color: #f39c12;
            text-shadow: none;
        }

        /* Navigation links container (aligned to the right) */
        .nav-links {
            list-style-type: none;
            padding: 0;
            margin: 0;
            display: flex;
        }

        /* Individual navigation links */
        .nav-links li {
            margin: 10px 10px;
            
            
           
        }

        .nav-links a {
            color: white;
            text-decoration: none;
            font-size: 25px;
            padding:  6px;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }

        /* Change link color on hover */
        .nav-links a:hover {
            background-color: #f39c12;
            color: black;
        }

        /* Styling for buttons */
        .swd-button {
            background: linear-gradient(45deg, #f39c12, #f2db18);
            border: none;
            border-radius: 5px;
            color: black;
            font: bold 14px Arial, Helvetica, sans-serif;
            padding: 10px 20px;
            text-decoration: none;
            text-transform: uppercase;
            margin-top: 3px;
            margin-bottom: 10px;
            transition: background-color 0.3s ease;
            display: inline-block;
        }

        .swd-button:hover {
            background-color: #f39c12;
        }

        /* Align the buttons to the right */
        .button-container {
            margin-left: 1200px; /* This pushes the button container to the right */
            display: flex;
            gap: 10px;
        }

        /* Optional: For responsive design */
        @media (max-width: 768px) {
            nav {
                flex-direction: column;
                align-items: flex-start;
            }

            .nav-links {
                flex-direction: column;
                align-items: center;
            }

            .nav-links li {
                margin: 10px 10px;
                
               
            }

            .button-container {
                width: 100%;
                justify-content: flex-end;
                margin-top: 10px;
            }
        }
    </style>
</head>
<body>
    <header>
        <%
            if (session.getAttribute("myproject") != null) {
        %>
        <div style="font-size: 30px; margin-left: 1200px; color: purple; ">
            <p>Welcome: <%= session.getAttribute("name") %></p>
        </div>
        <%
            }
        %>

        <nav>
            <!-- Logo and navigation links -->
            <div class="logo">
                <a  href="index.jsp">TOYZWIN</a>
            </div>
            <ul class="nav-links">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="contact.jsp">Contact</a></li>
                <li><a href="about.jsp">About Us</a></li>
                

                <%
                if (session.getAttribute("myproject") != null) {
                %>
                <li><a href="product.jsp">Products</a></li>
                <li><a href="wishlist.jsp">Wishlist</a></li>
                <li><a href="cart.jsp">Cart</a></li>
                <%
                }
                %>
            </ul>
            

            <div class="button-container">
                <%
                    if (session.getAttribute("myproject") != null) {
                %>
                    <a class="swd-button" href="logout.jsp">Logout</a>
                <%
                    } else {
                %>
                    <a class="swd-button" href="signup.jsp">Sign up</a>
                    <a class="swd-button" href="signin.jsp">Sign in</a>
                <%
                    }
                %>
            </div>
        </nav>
    </header>
</body>
</html>
