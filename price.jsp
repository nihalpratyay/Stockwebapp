<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PriceUpdate Page</title>
</head>
<body>
<h2 align="center">
		<h1>Update Product Price</h1>
		<form action="updateprice" method="post">
			Name: <input type="text" name="pName"> 
			Price: <input type="double" name="pPrice"> 
			<input	type="submit" value="Update">
		</form>
	</h2>
</body>
</html>