<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Songs by artist: <c:out value="${artist}">${artist}</c:out></p>
	<a href="/dashboard">Dashboard</a>
	
	<form action="/songs/artista" method="POST">
		<div>
			<input type="search" name="artist">
		</div>
		<button type="submit">New Search</button>
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
			<c:forEach var="song" items="${songsArtist}">
				<tr>
					<td><a href="/songs/${song.id}"> <c:out value="${song.title}" /></a></td>
					<td><c:out value="${song.rating}" /></td>
					<td>
						<form action="/eliminar" method="POST">
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