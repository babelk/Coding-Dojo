<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contador</title>
  	<link rel="stylesheet" type="text/css" href="/css/style.css">
  
</head>
<body>
    <p id = p1>You have visited a <a href=""> http://your_server</a></p>
    <p id = p2><c:out value="${count}"/> times.</p>
	<div id = div1>
		<p id = p3><a id = a1 href="http://localhost:8080/your_server">Test another visit?</a></p>
		<p id = p5><a href = "http://localhost:8080/your_server/2">Test another visit x2?</a></p>
    	<p id = p4> or </p>
    	<button id = b1><a href="http://localhost:8080/your_server/cerrarSesion">Reset</a></button>
	</div>
</body>
</html>