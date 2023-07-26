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
	<div class="container">
		<form:form accept-charset="UTF-8" action="/licenses/new" method="post"
		modelAttribute="licencia">
		<h1>New License</h1>
		<p>
			Personas:
			<c:choose>
				<c:when test="${empty personas}">
				
				<select name="persona" id="persona1">
						<option >No hay personas</option>
					</select>		      		
		    </c:when>
				<c:otherwise>
					<select name="persona" id="persona1">
						<c:forEach items="${personas}" var="persona">
							<option value="${persona.id}">${persona.firstName} ${persona.lastName}</option>
						</c:forEach>
					</select>
				</c:otherwise>
			</c:choose>
		</p>
		<p>
			<form:label path="state">State:</form:label>
			<form:errors path="state" />
			<form:input id="input2" path="state" />
		</p>
		<p>
			<form:label path="expirationDate">Expiration Date:</form:label>
			<form:errors path="expirationDate" />
			<input id="input3" type="date" id="expirationDate" name="expirationDate">
		</p>
		<input id="create2" type="submit" value="Create" />
	</form:form>
	</div>

</body>
</html>