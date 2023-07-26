<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="container">
		<h1><c:out value="${persona.get().firstName}" /> <c:out value="${persona.get().lastName}" /></h1>
		<div><p class="show1">License Number:</p> <p class="show1"><c:out value="${persona.get().licencia.number}" /></p></div>
		<div><p class="show2">State:</p> <p class="show2"><c:out value="${persona.get().licencia.state}" /></p></div>
		<div>
			<p class="show3">Expiration Date:</p>
			<p class="show3">
				<fmt:formatDate value="${persona.get().licencia.expirationDate}" pattern="yyyy-MM-dd" />
			</p>
		</div>
	</div>
</body>
</html>
