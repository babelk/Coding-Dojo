<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Lenguajes</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<form action="/languages/${lenguaje.id}" method="post">
		<input type="hidden" name="_method" value="delete"> <input
			id="delete2" type="submit" value="Delete">
	</form>
	<a id="dashboard" href="http://localhost:8080/languages">Dashboard</a>
	<form:form accept-charset="UTF-8" action="/languages/${lenguaje.id}"
		method="post" modelAttribute="lenguaje">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label class="name1" path="name">Name</form:label>
			<form:errors path="name" />
			<form:input class="cuadro" path="name" />
		</p>
		<p>
			<form:label class="name" path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:input class="cuadro" path="creator" />
		</p>
		<p>
			<form:label class="name" path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input class="cuadro" path="currentVersion" />
		</p>
		<input id="button" type="submit" value="Submit" />
	</form:form>
</body>
</html>