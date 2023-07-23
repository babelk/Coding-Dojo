<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lenguajes</title>
<link rel="stylesheet" href="/css/style.css">

</head>
<body>
	<table id="table">
		<thead id="thead">
			<tr id="">
				<th class="col">Name</th>
				<th class="col">Creator</th>
				<th class="col">Version</th>
				<th class="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<%-- Mostrar los lenguajes reales --%>
			<c:forEach items="${lenguajes}" var="lenguaje">
				<tr>
					<td><a class="a1" href="/languages/${lenguaje.id}"><c:out
								value="${lenguaje.name}" /></a></td>
					<td><c:out value="${lenguaje.creator}" /></td>
					<td><c:out value="${lenguaje.currentVersion}" /></td>
					<td>
						<form action="/languages/${lenguaje.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								id="delete" type="submit" value="delete">
						</form> <a id="edit" href="/languages/${lenguaje.id}/edit">edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form accept-charset="UTF-8" action="/languages" method="post"
		modelAttribute="lenguaje">
		<p>
			<form:label class="name1" path="name">Name</form:label>
			<form:errors path="name" />
			<form:input class="cuadro" path="name" />
		</p>
		<p>
			<form:label class="name" path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:input class="cuadro" path="creator" />
		</p>
		<p>
			<form:label class="name" path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input class="cuadro" path="currentVersion" />
		</p>
		<input id="button" type="submit" value="Submit" />
	</form:form>
	<script src="/js/script.js"></script>
</body>
</html>
