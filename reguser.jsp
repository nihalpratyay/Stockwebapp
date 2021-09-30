<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserRegister Page</title>
</head>
<body>
	<h2 align="center">
		<h1>Register Here</h1>
		<form action="registeruser" method="post">
			Fullname:<input type="text" name="userName"><br>
			Username:<input type="text" name="userUsername"><br>
			Password:<input type="password" name="userPassword"><br>
			<input type="submit" value="Register">
		</form>
	</h2>
</body>
</html>