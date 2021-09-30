<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminRegister Page</title>
</head>
<body>
	<h2 align="center">
		<h1>Register Here</h1>
		<form action="registeradmin" method="post">
		    
			Fullname:<input type="text" name="adminName"><br>
			Username:<input type="text" name="adminUsername"><br>
			Password:<input type="password" name="adminPassword"><br>
			<input type="submit" value="Register">
		</form>
	</h2>
</body>
</html>