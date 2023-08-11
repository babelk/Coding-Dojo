<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${not empty error}">
		<h1>
			<c:out value="${error}"></c:out>
		</h1>
	</c:when>
	<c:otherwise>

		<h1>
			Gerente:
			<c:out value="${manager.firstName} ${manager.lastName}"></c:out>
		</h1>

		<h2>Empleados</h2>
		<table id="table">
			<thead id="thead">
				<tr id="">
					<th class="col">Nombre</th>
					<th class="col">Apellido</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${empleados}" var="empleado">
					<tr>
						<td><c:out value="${empleado.firstName}" /></td>
						<td><c:out value="${empleado.lastName}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>
