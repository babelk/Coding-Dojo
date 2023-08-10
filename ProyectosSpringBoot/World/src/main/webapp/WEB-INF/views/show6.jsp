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
				<th>Nombre del País</th>
				<th>Tipo de Gobierno</th>
				<th>Area del País</th>
				<th>Expectativas de vida</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${table}">
				<tr>
					<td>${row.name}</td>
					<td>${row.government_form}</td>
					<td>${row.capital}</td>
					<td>${row.life_expectancy}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>