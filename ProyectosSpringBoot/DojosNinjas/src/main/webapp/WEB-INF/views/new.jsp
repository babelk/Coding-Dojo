<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<form:form accept-charset="UTF-8" action="/ninjas/new" method="post" modelAttribute="ninja">
		<p>
			Dojos
			<c:choose>
				<c:when test="${empty dojos}">
				
				<select name="dojo" id="dojo">
						<option >No hay dojos</option>
					</select>		      		
		    </c:when>
				<c:otherwise>
					<select name="dojo" id="dojo">
						<c:forEach items="${dojos}" var="d">
							<option value="${d.id}">${d.name}</option>
						</c:forEach>
					</select>
				</c:otherwise>
			</c:choose>
		</p>
		<p>
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">Age</form:label>
			<form:errors path="age" />
			<form:input path="age" />
		</p>
		<input type="submit" value="Create" />
	</form:form>

</body>
</html>