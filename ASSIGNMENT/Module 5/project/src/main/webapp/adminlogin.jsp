<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login - Admin Panel</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Custom CSS -->
 <style>
  /* Global Styles */
  body {
    font-family: 'Arial', sans-serif;
    background-color: #f0f8ff; /* Light background color */
    margin: 0;
    padding: 0;
    height: 100vh;
  }

  /* Background Image */
  .background-image {
    background: url('https://source.unsplash.com/1600x900/?technology,admin') no-repeat center center fixed;
    background-size: cover;
    height: 100%;
    width: 100%;
    position: absolute;
    z-index: -1;
  }

  /* Login Container */
  .login-container {
    margin-top: 100px;
    padding: 30px;
    background-color: rgba(255, 255, 255, 0.85); /* Light white background */
    border-radius: 10px;
    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
    border-left: 5px solid #007bff; /* Blue border on the left */
  }

  /* Card Header */
  .card-title {
    font-size: 30px;
    font-weight: bold;
    color: #0056b3; /* Deep blue for the title */
    margin-bottom: 20px;
  }

  /* Form Elements */
  .form-group {
    margin-bottom: 20px;
  }

  .form-group label {
    font-size: 16px;
    font-weight: bold;
    color: #333; /* Dark grey color for labels */
  }

  .form-control {
    height: 45px;
    font-size: 16px;
    border-radius: 5px;
    border: 1px solid #ddd;
    padding-left: 15px;
    background-color: #f9f9f9;
    transition: border-color 0.3s ease;
  }

  /* Focus Effects */
  .form-control:focus {
    border-color: #007bff; /* Blue focus color */
    box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
  }

  /* Submit Button */
  .btn {
    background-color: #28a745; /* Green button */
    color: #fff;
    font-size: 16px;
    font-weight: bold;
    border-radius: 5px;
    padding: 12px 20px;
    transition: background-color 0.3s ease, transform 0.3s ease;
    width: 100%;
    border: none;
  }

  /* Button Hover Effect */
  .btn:hover {
    background-color: #218838; /* Darker green on hover */
    transform: scale(1.05);
  }

  /* Button Focus Effect */
  .btn:focus {
    outline: none;
    box-shadow: 0 0 0 0.2rem rgba(72, 180, 97, 0.5); /* Green glow on focus */
  }

  /* Responsive Design */
  @media (max-width: 768px) {
    .login-container {
      margin-top: 50px;
    }

    .card-title {
      font-size: 24px;
    }
  }
</style>

</head>
<body>





  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-4">
        <div class="card login-container">
          <div class="card-body">
           <h3 class="card-title text-center mb-4">TOYZWIN</h3>
            <h3 class="card-title text-center mb-4">Admin Panel Login</h3>
            
            <form action="adminlogincheck.jsp">
              <div class="form-group">
                <label for="username">Username</label>
                <input type="text" class="form-control" name="username" placeholder="Enter username">
              </div>
              <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" name="password" placeholder="Enter password">
              </div>
              <button type="submit" class="btn btn-primary btn-block">Login</button>
            </form>
          
          
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap JS and dependencies -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>