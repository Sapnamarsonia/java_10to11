<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:include page="./templates/header.jsp" />
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 10;
            padding: 10;
            background-color: #f4f4f4;
        }
        header {
            background-color: #334;
            color: white;
            text-align: center;
            padding: 15px 0;
        }
        .content {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            margin-top: 50px;
        }
        .button-container {
            display: flex;
            gap: 40px;
        }
        .btn {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
        }
        .btn:hover {
            background-color: #45a049;
        }
        
        
    </style>
    <style>
        .spacer {
            height: 20px; /* Adjust the value as needed */
        }
    </style>

</head>
<body>
 <!-- Content Section -->
    <div class="content">
        <h2>Computer Accessories</h2>
        <div class="spacer"></div>
        <!-- Buttons for Add Product and View Product -->
        <div class="button-container">
            <form action="addProduct.jsp" method="post">
                <button class="btn" type="submit">Add Product</button>
            </form>
            <form action="viewproduct.jsp" method="post">
                <button class="btn" type="submit">View Product</button>
            </form>
        </div>
    </div>
    

</body>
</html>
