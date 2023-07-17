<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultados</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div id="container">
        <h1>Submitted Info</h1>
<table>
        <tr>
            <th>Name:</th>
            <td>${name}</td>
        </tr>
        <tr>
            <th>Dojo location:</th>
            <td>${location}</td>
        </tr>
        <tr>
            <th>Favorite language:</th>
            <td>${language}</td>
        </tr>
        <tr>
            <th>Comment:</th>
            <td>${comment}</td>
        </tr>
    </table>
        <button id="btn2"><a href="http://localhost:8080">Go Back</a></button>
    </div>
</body>
</html>