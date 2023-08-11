<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="http://localhost:8080/questions">Dashboard</a>
	
	<form:form accept-charset="UTF-8" action="/questions/new" method="post" modelAttribute="newQuestion">		  
		    <h2>
		        <form:label path="question">Question:</form:label>
		        <form:input type="text" path="question"/>
		        <form:errors path="question"/>

		    </h2>
		    <p><c:out value="${errorTags}"></c:out></p>
		    <h2>
		    	<label for="tagString">Tags :</label>
		        <input type="text" name="tagString">
		        
		    </h2>
		   
		    <input type="submit" value="Submit"/>	 
		</form:form>
</body>
</html>