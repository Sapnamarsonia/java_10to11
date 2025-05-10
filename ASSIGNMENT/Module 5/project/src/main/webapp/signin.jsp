<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    /* Ensures the body and html take full height but don't affect other elements */
    body, html {
        height: 100%;
        margin: 0;
    }

    /* This wrapper will center the form */
    .center-container {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh; /* Takes up full viewport height */
    }

    .card {
        width: 100%;
        max-width: 400px; /* Set max-width for the form */
    }

    .card-body {
        padding: 20px;
    }
</style>

</head>
<body>
	<jsp:include page="header.jsp"/>
	
	<!-- This container will center the form -->
	<div class="center-container">
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">Login Here</h4>
				<p class="text-center"></p>
				
				
				<form action="login.jsp">
					
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-envelope"></i>
							</span>
						</div>
						<input name="email" class="form-control" placeholder="Email address"
							type="email" id="email" onblur="verifyEmail()">
							
					</div>
					<!-- form-group// -->
					
				
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i>
							</span>
						</div>
						<input class="form-control" placeholder="Enter password"
							type="password" name="password" id="password">
					</div>
					<!-- form-group// -->
					
					<!-- form-group// -->
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">
							Login</button>
					</div>
					<!-- form-group// -->
					<p class="text-center">
						Do you want to <a href="signup.jsp">Sign up?</a>
					</p>
				</form>
				<span id="tops"></span>
			</article>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>

</body>
</html>
