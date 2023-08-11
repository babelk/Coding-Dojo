<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="http://localhost:8080/questions">Dashboard</a>
	
	<h1><c:out value="${question.question}"></c:out></h1>
	<h2>Tags: 
		<c:forEach items="${tags}" var="tag">
			<c:out value="${tag.subject}"></c:out>
			
		</c:forEach>
	</h2>
	<table class="table">
		<thead>
			<tr>
				<th>Answers</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${question.answers}" var="answer">
				<tr>
					<td><c:out value="${answer.answer}"/></td>
				</tr>
			 </c:forEach>
		 </tbody>
	 </table>
	
	
	<h2>Add your answer:</h2>
	<p><c:out value="${error}"></c:out>
	
	<form:form accept-charset="UTF-8" action="/questions/${question.id}" method="POST" modelAttribute="newAnswer">
		<form:label path="answer">Answer:</form:label>
		 <form:input type="text" path="answer"/>
		 <form:errors path="answer"/>
		
		<input type="submit" value="Add answer"/>	
	</form:form>
	
</body>
</html>