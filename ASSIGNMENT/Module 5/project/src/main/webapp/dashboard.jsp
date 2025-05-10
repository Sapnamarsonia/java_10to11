<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Toy Store Dashboard</title>
    <style>
        body {
            background-color: #3498db; /* Solid blue background */
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .main-content {
            padding: 20px;
            display: flex;
            justify-content: center; /* Center content horizontally */
            align-items: center; /* Center content vertically */
            min-height: 100vh; /* Full height to center content on screen */
        }

        .dashboard {
            display: flex;
            justify-content: center; /* Center cards horizontally */
            flex-wrap: wrap;
            gap: 20px;
        }

        .card {
            width: 350px; /* Adjust width as necessary */
            height: 450px; /* Adjust height as necessary */
            border: 1px solid #ccc;
            border-radius: 8px;
            overflow: hidden;
            background-color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .card img {
            width: 100%;
            height: 100%;
            object-fit: cover; /* Ensures images maintain aspect ratio without distortion */
        }
    </style>
</head>
<body>
    <div class="main-content">
        <section class="dashboard">
            <div class="card">
                <img src="images/toy1.webp" alt="Toy Image 1" class="animated-image">
            </div>
            <div class="card">
                <img src="images/toy3.webp" alt="Toy Image 2" class="animated-image">
            </div>
            <div class="card">
                <img src="images/toy2.webp" alt="Toy Image 3" class="animated-image">
            </div>
        </section>
    </div>
</body>
</html>
