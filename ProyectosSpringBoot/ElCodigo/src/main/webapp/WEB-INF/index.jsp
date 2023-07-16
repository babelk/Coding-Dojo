<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id = div1>
		<p id = error>
			<c:out value="${error}" />
		</p>
		<p>What is the code?</p>
		<form action="/verify-code" method="post">
			
			<input type="text" id="code" name="code">
			<br>
			<button type="submit">Try code</button>
		</form>
	</div>
</body>
</html>