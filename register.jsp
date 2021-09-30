<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1 align="center">Register the Product Details Here</h1>
<hr>
	<h3 align="center">
		<form action="registration" method="post">
			Name: <input type="text" name="pName"><br>
			Category: <input type="text" name="pCategory"><br>
			Company: <input type="text" name="pCompany"><br>
			Quantity: <input type="number" name="pQuantity"><br>
			Price: <input type="number" name="pPrice"><br>
			<input type="submit" value="Register">
		</form>
	</h3>


</form>
</body>
</html>