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
	<a href="http://localhost:8080/dashboard">Dashboard</a>
	
	<form:form action="/songs/new" method="post" modelAttribute="newSong">		  
		    <h2>
		        <form:label path="title">Title:</form:label>
		        <form:input path="title"/>
		        <form:errors path="title"/>

		    </h2>
		    <h2>
		        <form:label path="artist">Artist:</form:label>
		        <form:input path="artist"/>
   				<form:errors path="artist"/>
		    </h2>
		    <h2>
		        <form:label path="rating">Rating:</form:label>
		        <form:select path="rating">
		        	<form:option value="1">1</form:option>
		        	<form:option value="2">2</form:option>
		        	<form:option value="3">4</form:option>
		        	<form:option value="4">4</form:option>
		        	<form:option value="5">5</form:option>
		        	<form:option value="6">6</form:option>
		        	<form:option value="7">7</form:option>
		        	<form:option value="8">8</form:option>
		        	<form:option value="9">9</form:option>
		        	<form:option value="10">10</form:option>
		        </form:select>
    		 	<form:errors path="rating"/>
		    </h2>
		    <input id="btn" type="submit" value="Add Song"/>	 
		</form:form>
</body>
</html>