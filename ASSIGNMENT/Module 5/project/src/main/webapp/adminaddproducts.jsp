<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Panel</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Custom CSS -->
  <style>
    /* General body and background styling */
    body {
      background-color: #f1f7fc;
      font-family: 'Poppins', sans-serif;
      color: #333;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    /* Form container styling */
    .form-container {
      background: #ffffff;
      padding: 40px;
      width: 100%;
      max-width: 550px;
      border-radius: 12px;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
      text-align: center;
      position: relative;
    }

    /* Form header styling */
    h3 {
      font-size: 28px;
      font-weight: 700;
      color: #ff5733;
      margin-bottom: 30px;
    }

    /* Input Fields */
    .form-control {
      border-radius: 10px;
      padding: 20px;
      margin: 30px 10px;
      font-size: 16px;
      border: 1px solid #e0e0e0;
    }
    .form-control:focus {
      border-color: #ff5733;
      box-shadow: 0 0 5px rgba(255, 87, 51, 0.4);
    }

    /* Button Styling */
    .btn-primary {
      background-color: #ff5733;
      color: white;
      border-radius: 10px;
      padding: 12px 25px;
      border: none;
      font-weight: 600;
      transition: background-color 0.3s ease;
    }

    .btn-primary:hover {
      background-color: #ff4500;
    }

    /* Close Button Styling */
    .close-btn {
      position: absolute;
      top: 15px;
      right: 15px;
      font-size: 24px;
      color: #ff5733;
      background: none;
      border: none;
      cursor: pointer;
      transition: color 0.3s;
    }

    .close-btn:hover {
      color: #ff4500;
    }

    /* Textarea Styling */
    textarea {
      border-radius: 10px;
      padding: 12px;
      margin: 10px 0;
      font-size: 16px;
      border: 1px solid #e0e0e0;
      height: 120px;
      resize: none;
    }
    textarea:focus {
      border-color: #ff5733;
      box-shadow: 0 0 5px rgba(255, 87, 51, 0.4);
    }

    /* Mobile Responsiveness */
    @media (max-width: 767px) {
      .form-container {
        padding: 25px;
      }
      h3 {
        font-size: 24px;
      }
    }
  </style>
</head>
<body>
<%
    response.setHeader("cache-control", "no-cache");
    response.setHeader("cache-control", "no-store");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>

<%
    if(session.getAttribute("admin") != null) {
    } else {
        response.sendRedirect("adminlogin.jsp");
    }
%>

<!-- Main Content -->
<div class="form-container">
    <!-- Close Button -->
    <button class="close-btn" onclick="window.location.href='admindashboard.jsp'">&times;</button>
    <h3>Add Product</h3>
    <form action="imageSave" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>
        <!-- Product Name -->
        <div class="form-group">
            <input class="form-control" type="text" name="p_name" placeholder="Product Name" required>
        </div>
        <!-- Product Price -->
        <div class="form-group">
            <input class="form-control" type="text" name="p_price" placeholder="Product Price" required>
        </div>
        <!-- Product Description -->
        <div class="form-group">
            <input class="form-control" type="text" name="p_des" placeholder="Product Description" required>
        </div>
        <!-- Product Image -->
        <div class="form-group">
            <input class="form-control" type="file" name="p_image" required>
        </div>
        <!-- Submit Button -->
        <div class="form-button">
            <button id="submit" type="submit" class="btn btn-primary">Add Product</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
