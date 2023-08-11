<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	 <h1>Questions Dashboard</h1>
	 <c:choose>
	 	<c:when test="${empty questions}">
        	<h2>No hay Preguntas</h2>
    	</c:when>
    	<c:otherwise>
        	<table class="table">
				<thead>
					<tr>
						<th scope="col">Question</th>
						<th scope="col">Tags</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${questions}" var="question">
						<tr>
							<td><a href="http://localhost:8080/questions/${question.id}"> <c:out value="${question.question}" /></a></td>
							<td>
								<c:forEach items="${question.tags}" var="tag" varStatus="loop">
				                    <c:out value="${tag.subject}" />
				                    <c:if test="${not loop.last}">, </c:if>
				                </c:forEach>
			                </td>
						</tr>
					 </c:forEach>
				 </tbody>
			 </table>
    	</c:otherwise>
	 </c:choose>
	 
	 
	 
	 <a href="http://localhost:8080/questions/new">New Question</a>
</body>
</html>