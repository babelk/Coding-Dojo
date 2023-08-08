<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Top Ten Songs:</p>
	<a href="http://localhost:8080/dashboard">Dashboard</a>
	<ul>
			<c:forEach items="${topTen}" var="song">
				<li>
					<h2><c:out value="${song.rating}"/> - <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> - <c:out value="${song.artist}"/></h2>
				</li>
			</c:forEach>
		</ul>
</body>
</html>