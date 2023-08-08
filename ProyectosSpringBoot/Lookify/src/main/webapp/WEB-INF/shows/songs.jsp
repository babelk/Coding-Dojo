<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="http://localhost:8080/dashboard">Dashboard</a>
	<h2>Title: <c:out value="${song.title }"></c:out></h2>
	<h2>Artist: <c:out value="${song.artist }"></c:out></h2>
	<h2>Rating (1-10): <c:out value="${song.rating }"></c:out></h2>
	
	<form action="/eliminar/${song.id}" method="POST">
		<input type="hidden" name="song" value="${song.id}" />
		<button  type="submit">Delete</button>
	</form>
</body>
</html>