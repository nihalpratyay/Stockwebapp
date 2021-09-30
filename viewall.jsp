<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Viewrecords Page</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Category</th>
			<th>Company</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach var="dto" items="${lDtos }">
			<tr>
				
				<td><c:out value="${dto.getPName() }"></c:out></td>
				<td><c:out value="${dto.getPCategory() }"></c:out></td>
				<td><c:out value="${dto.getPCompany() }"></c:out></td>
				<td><c:out value="${dto.getPQuantity() }"></c:out></td>
				<td><c:out value="${dto.getPPrice() }"></c:out></td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>