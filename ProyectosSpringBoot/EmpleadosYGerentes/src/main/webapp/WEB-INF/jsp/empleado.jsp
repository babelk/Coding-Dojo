<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
    <c:when test="${not empty error}">
        <h1>
            <c:out value="${error}"></c:out>
        </h1>
    </c:when>
    <c:otherwise>
        <h1>
            Empleado:
            <c:out value="${empleado.firstName} ${empleado.lastName}"></c:out>
        </h1>

        <h2>Gerente:</h2>
        <table id="table">
            <thead id="thead">
                <tr id="">
                    <th class="col">Nombre</th>
                    <th class="col">Apellido</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><c:out value="${manager.firstName}" /></td>
                    <td><c:out value="${manager.lastName}" /></td>
                </tr>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>
