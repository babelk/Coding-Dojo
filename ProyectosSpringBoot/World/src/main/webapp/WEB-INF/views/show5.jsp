<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Country Name</th>
				<th>Country Surface Area</th>
				<th>Country Population</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${table}">
				<tr>
					<td>${row.name}</td>
					<td>${row.surface_area}</td>
					<td>${row.population}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>