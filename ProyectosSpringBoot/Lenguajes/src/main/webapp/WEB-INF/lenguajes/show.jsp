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
	<a id="dashboard2" href="http://localhost:8080/languages">Dashboard</a>
	<p class="p1">
		<c:out value="${lenguaje.name}" />
	</p>
	<p class="p1">
		<c:out value="${lenguaje.creator}" />
	</p>
	<p class="p1">
		<c:out value="${lenguaje.currentVersion}" />
	</p>
	<a id="edit3" href="/languages/${lenguaje.id}/edit">Edit</a>
	<form action="/languages/${lenguaje.id}" method="post">
		<input type="hidden" name="_method" value="Delete"> <input
			id="delete3" type="submit" value="delete">
	</form>
</body>
</html>