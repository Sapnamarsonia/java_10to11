<%@page import="java.util.List"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="./templates/header.jsp" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.product-grid {
	display: grid;
	grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
	grid-gap: 20px;
	padding: 20px;
}

.product {
	border: 1px solid #ccc;
	padding: 10px;
	text-align: center;
}

.product img {
	max-width: 100px;
	max-height: 100px;
}

.swd-button {
	background: #f2db18;
	border: 1px solid white;
	border-radius: 5px;
	color: white;
	display: inline-block;
	font: bold 12px Arial, Helvetica, sans-serif;
	padding: 10px 15px;
	text-decoration: none;
	text-transform: uppercase;
	margin-top: 15px;
}
</style>
<style>
.btn {
	padding: 8px;
	margin: 5px;
	border: none;
	cursor: pointer;
	margin-bottom: 5px;
}

.btn-edit {
	background-color: #4CAF50; /* Green */
	color: white;
}

.btn-delete {
	background-color: #f44336; /* Red */
	color: white;
}
</style>

</head>
<body>
	<div class="product-grid">
		<%
		List<Model> list = Dao.viewdata();

		for (Model m2 : list) {
		    String imageFilename  = m2.getPimage();		
            String imagePath = "static/images/" + imageFilename; // Construct the image path

		%>

		<div class="product">
    <img src="<%= imagePath %>" width="150px" height="200px" alt="Product Image" />
			<p>
				<b>Name:</b>
				<%=m2.getPname()%></p>
			<p>
				<b>Category:</b>
				<%=m2.getPcategory()%></p>
			<p>
				<b> Model</b><%=m2.getPmodel()%>
			<p>
				<b>Price:</b>
				<%=m2.getMyprice()%></p>
			<p>
				<b>Description:</b>
				<%=m2.getPdescription()%></p>



			<!-- Delete Button -->
			<div class="d-flex justify-content-center">
				<!-- Edit Button -->
				<a href="edit.jsp?id=<%=m2.getId()%>" class="edit-button btn-edit">
					<button class="btn">
						<i class="fa fa-edit"></i>
					</button>
				</a>
				<form action="delete.jsp" method="post">
					<button class="btn"
						onclick="return confirm 'Are you sure you want to delete this product?'">
						<i class="fa fa-trash"></i>
					</button>
					<input type="hidden" name="id" value="<%=m2.getId()%>" />
				</form>
			</div>


		</div>

		<%
		}
		%>
	</div>
</body>
</html>