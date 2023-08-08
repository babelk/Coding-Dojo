<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<a href="http://localhost:8080/songs/new">Add New</a>
	<a href="http://localhost:8080/search/topTen">Top Songs</a>
	<form action="/songs/artista" method="POST">
		<div>
			<input type="search" name="artist">
		</div>
		<button type="submit">Search artist</button>
	</form>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Rating</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="/songs/${song.id}"> <c:out value="${song.title}" /></a></td>
					<td><c:out value="${song.rating}" /></td>
					<td>
						<form action="/eliminar/${song.id}" method="POST">
							<input type="hidden" name="song" value="${song.id}" />
							<button  type="submit">Delete</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>