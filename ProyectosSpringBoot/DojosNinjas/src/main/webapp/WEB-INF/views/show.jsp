<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1><c:out value="${dojo.name}" /> Ninjas</h1>
	<table id="table">
		<thead id="thead">
			<tr id="">
				<th class="col">Name</th>
				<th class="col">Last Name</th>
				<th class="col">Age</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
					<td><c:out value="${ninja.firstName}" /></td>
					<td><c:out value="${ninja.lastName}" /></td>
					<td><c:out value="${ninja.age}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>