<%@page import="com.model.ProductModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.CartModel"%>
<%@page import="com.model.WishlistModel"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>




</head>
<body>
<jsp:include page="header.jsp"/>
	<%
		
		if(session.getAttribute("myproject")!=null)
		{
			String id = request.getParameter("id");
			int id2 = Integer.parseInt(id);
			System.out.print(id2);
			WishlistModel m = Dao.getimageindexwise2(id2);
			String number = request.getParameter("number");
			int num2 = Integer.parseInt(number);
			int price = Integer.parseInt(m.getP_price()); 
			
	%>
		
			<br>
			<br>
			<center>
			<%-- 	<h2><%=m.getId() %></h2> --%>
			<h2><%=m.getP_name() %></h2>
			<h3><%=m.getP_price() %></h3>
			<h3><%=m.getP_des() %></h3>
			<img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="350px" height="300px" />
   
   			<%!
   			
   					int count(int num2,int price)
   					{
   						return num2*price;
   					}
   			
   			%>
   			
   			<% int finalprice = count(num2, price);%>
   
		<form action="imageSave4" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>


							 <div class="col-md-12">
                               <input class="form-control" type="hidden" name="id" placeholder="Product Name" value="<%=m.getId() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="p_name" placeholder="Product Name" value="<%=m.getP_name() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="p_price" placeholder="Product Price" value="<%=m.getP_price() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="p_des" placeholder="Product Description" value="<%=m.getP_des() %>" readonly="readonly">
                            </div>
                            
                             <div class="col-md-12">
                               <input class="form-control" type="text" name="p_qua" placeholder="Product Description" value="<%=num2%>" readonly="readonly">
                            </div>
                            
                             <div class="col-md-12">
                               <input class="form-control" type="hidden" name="email" placeholder="Product Description" value="<%=session.getAttribute("email")	%>" readonly="readonly">
                            </div>
                            
                            <br>
                            
                              <div class="col-md-12">
                               <input class="form-control" type="text" name="fp" placeholder="Product Description" value="<%=finalprice %>" readonly="readonly">
                            </div>
                            
                            <div class="col-md-12">
                            	<input type="hidden" name="p_image" value="data:image/jpeg;base64,<%=m.getP_image() %>" /> 
                             </div>
                               
                  			<br>
                  

                            <div class="form-button mt-3">
                                <button id="submit" type="submit" class="btn btn-primary">Add to Cart </button>
                            </div>
                        </form>
	
	<% 		
		}
		else
		{

	%>
			<br>
			<center>
					
					<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Please Login First!!</p></b>
				</center>

				<br>
				<br>
			<%@ include file="signin.jsp"%>

		<% 
		}
		%>

<jsp:include page="footer.jsp"/>
</body>
</html>