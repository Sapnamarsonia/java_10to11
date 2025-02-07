<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<jsp:include page="./templates/header.jsp" />
<style>
table {
	width: 100%;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid black;
}

th, td {
	padding: 8px;
	text-align: left;
}

input[type="text"], input[type="number"], input[type="file"] {
	width: 100%;
	padding: 8px;
	margin: 4px;
}

input[type="submit"] {
	padding: 10px 15px;
	background-color: #4CAF50;
	color: white;
	border: none;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

.modal .modal-dialog {
	max-width: 400px;
}

.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}

.modal .modal-content {
	border-radius: 3px;
	font-size: 14px;
}

.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}

.modal .modal-title {
	display: inline-block;
}

.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}

.modal textarea.form-control {
	resize: vertical;
}

.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}

.modal form label {
	font-weight: normal;
}

.close-btn {
	color: #aaa;
	font-size: 28px;
	font-weight: bold;
	float: right;
	cursor: pointer;
}

.close-btn:hover, .close-btn:focus {
	color: black;
	text-decoration: none;
	cursor: pointer;
}

modal.dialog {
	display: none; /* Hidden by default */
	position: fixed;
	z-index: 1;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	background-color: rgb(0, 0, 0);
	background-color: rgba(0, 0, 0, 0.4);
	padding-top: 60px;
}

modal.dialog-content {
	background-color: #fefefe;
	margin: 5% auto;
	padding: 20px;
	border: 1px solid #888;
	width: 50%;
}
</style>


<body>

	<div class="modal-dialog">
		<div class="modal-content">


			<h2 class="text-center py-2">Add New Product</h2>
			<form action="imagesave" enctype="multipart/form-data" method="post">
				<table>
					<tr>
						<th>Product Name</th>
						<td><input type="text" name="pname" required /></td>
					</tr>
					<tr>
						<th>Category</th>
						<td><input type="text" name="pcategory" required /></td>
					</tr>
					<tr>
						<th>Model</th>
						<td><input type="text" name="pmodel" required /></td>
					</tr>
					<tr>
						<th>Price</th>
						<td><input type="text" name="myprice" required /></td>
					</tr>
					<tr>
						<th>Description</th>
						<td><input type="text" name="pdescription" required /></td>
					</tr>
					<tr>
						<th>Image</th>
						<td><input type="file" name="pimage" required /></td>
					</tr>
				</table>

				<br>
				<div class="d-flex justify-content-center pb-4">
					<button type="submit" class="btn btn-primary">
						Add Product
					</button>
				</div>
			</form>
		</div>

	</div>
</body>
</html>
