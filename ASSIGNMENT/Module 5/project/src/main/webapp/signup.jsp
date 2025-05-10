<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
<script type="text/javascript">

	function validateForm()
	{
		var fullname = document.getElementById('fullname');
		var email = document.getElementById('email');
		var phone = document.getElementById('phone');
		var pass = document.getElementById('password');
		var repass = document.getElementById('repassword');
		
		
		
			 if(isAlphabet(fullname, "Please enter only Alphabet for your name"))
				{
					if(isNumeric(phone, "Please enter Only Numbers"))
						{
							if(emailValidator(email, "Please enter a valid email address"))
								{
								 if(lengthRestriction(password, 1,10))
								 {
								  
							 		if(isEquals(repassword, "Password and Repeat Password mismatched!!"))
								 	{
								   		
							 			return true;
								 			
										
									}	
								}
						}
					}
				} 
		 
	 	
		
		
				
		return false;
		
	}
	
	function isAlphabet(elem, helperMsg)
	{
		var alphaExp = /^[a-zA-Z]+$/;
		if(elem.value.match(alphaExp))
		{
			return true;
		}
		else
		{
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	
	function isNumeric(elem, helperMsg)
	{
		var numericExpression = /^[0-9]+$/;
		if(elem.value.match(numericExpression))
		{
			return true;
		}
		else
		{
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function emailValidator(elem, helperMsg)
	{
		var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
		
		if(elem.value.match(emailExp))
		{
			return true;
		}
		else
		{
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function isEquals(elem, helperMsg)
	{
		 if(repassword.equals(password))
			 {
			    return true;
			 }
		 else
			 {
			    alert(helperMsg);
			    elem.focus();
			    return false;
			 }
	}
	function lengthRestriction(elem, min, max)
	{
		 var uInput = elem.value;
		 if(uInput.length >= min && uInput.length <= max)
			 {
			    return true;
			 }
		 else
			 {
			    alert("Please enter between " + min+ " and " +max+ "characters");
			    elem.focus();
			    return false;
			 }
	}



</script>

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
				<h4 class="card-title mt-3 text-center">Create Account</h4>
				<p class="text-center">Get started with your free account</p>
				
				
				<form action="register.jsp" action="register.jsp" method="get" onsubmit="return validateForm()">
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>
						<input name="fullname" class="form-control" placeholder="Full name"
							type="text" id="fullname">
					</div>
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
							<span class="input-group-text"> <i class="fa fa-phone"></i>
							</span>
						</div>
						<select class="custom-select" style="max-width: 120px;">
							<option selected="">+91</option>
							<option value="1">+1</option>

						</select> <input name="phone" class="form-control"
							placeholder="Phone number" type="text" id="phone">
					</div>
					
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i>
							</span>
						</div>
						<input class="form-control" placeholder="Create password"
							type="password" name="password" id="password">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i>
							</span>
						</div>
						<input name="repassword" class="form-control"
							placeholder="Repeat password" type="password" id="repassword">
					</div>
					<!-- form-group// -->
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">
							Create Account</button>
					</div>
					<!-- form-group// -->
					<p class="text-center">
						Have an account? <a href="signin.jsp">Log In</a>
					</p>
				</form>
				<span id="tops"></span>
			</article>
		</div>
	</div>
	
	<jsp:include page="footer.jsp"/>
</body>
</html>
