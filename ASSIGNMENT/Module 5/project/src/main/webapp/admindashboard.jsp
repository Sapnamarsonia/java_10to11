<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Custom CSS -->
<style>
  /* General body styles */
  body {
    background-color: #f8f9fa;
    font-family: 'Arial', sans-serif;
  }

  /* Sidebar styles */
  .sidebar {
    background-color: #343a40;
    color: white;
    height: 100vh;
    position: fixed;
    width: 250px;
    padding-top: 20px;
  }

  .sidebar h2 {
    text-align: center;
    font-size: 24px;
    margin-bottom: 20px;
  }

  .sidebar .nav-link {
    color: white;
    font-size: 16px;
    padding: 10px 20px;
  }

  .sidebar .nav-link:hover {
    background-color: #495057;
    border-radius: 4px;
  }

  .sidebar .nav-item {
    margin-bottom: 10px;
  }

  /* Content area styles */
  .content {
    margin-left: 260px;
    padding: 30px;
  }

  .content h2 {
    font-size: 28px;
    margin-bottom: 20px;
    font-weight: 700;
    color: #28a745;
  }

  .card {
    margin-bottom: 20px;
  }

  .card-header {
    font-size: 18px;
    font-weight: 600;
  }

  .card-body {
    font-size: 16px;
  }

  .card-body img {
    width: 80px;
    height: 80px;
  }

  .card-body .info {
    font-weight: bold;
    font-size: 20px;
  }

  .logout-btn {
    color: red;
    font-weight: bold;
  }

  /* Add bright background to key stats */
  .stats-card {
    background-color: #f8c102;
    color: white;
  }

  .stats-card:hover {
    background-color: #e6b100;
  }

  /* Responsive Design for small screens */
  @media (max-width: 767px) {
    .sidebar {
      position: relative;
      width: 100%;
      height: auto;
    }

    .content {
      margin-left: 0;
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
if(session.getAttribute("admin")!=null)
{
	
}
else
{
	response.sendRedirect("adminlogin.jsp");
}

%>

<div class="container-fluid">
  <div class="row">
    <!-- Sidebar -->
    <div class="col-md-3 sidebar">
      <h2>Admin Panel</h2>
      <ul class="nav flex-column">
        <li class="nav-item">
          <a class="nav-link" href="adminaddproducts.jsp">Add Products</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="adminviewproducts.jsp">View All Products</a>
        </li>
         <li class="nav-item">
              <a class="nav-link" href="adminplacedorder.jsp" style="color: white;">Placed Order</a>
            </li>
        
        <li class="nav-item">
          <a class="nav-link" href="admincontacted.jsp">Queries</a>
        </li>
        <li class="nav-item">
          <a class="nav-link logout-btn" href="adminlogout.jsp">Logout</a>
        </li>
      </ul>
    </div>

    <!-- Main Content -->
    <div class="col-md-9 content">
      <h2>Welcome to the Admin Panel</h2>

      <!-- Key Stats Widget -->
      <div class="row">
        <div class="col-md-4">
          <div class="card stats-card">
            <div class="card-body text-center">
              <img src="images/toyicon.jpg" alt="Toy Icon">
              <div class="info">100+</div>
              <p>Products Added</p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card stats-card">
            <div class="card-body text-center">
              <img src="images/order.jpg" alt="Order Icon">
              <div class="info">25</div>
              <p>Recent Orders</p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card stats-card">
            <div class="card-body text-center">
              <img src="images/query.jpg" alt="Query Icon">
              <div class="info">12</div>
              <p>Pending Queries</p>
            </div>
          </div>
        </div>
      </div>

    </body>
</html>
          
