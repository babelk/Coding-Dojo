<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/style.css">
<title>Libros</title>
</head>
<body>
	<div>
		<h1>New Dojo</h1>
		<form:form action="/dojos/new" method="post" modelAttribute="dojo">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name" />
				<form:input class="input1" path="name" />
			</p>
			<input type="submit" value="Create" />
		</form:form>
	</div>
</body>
</html>