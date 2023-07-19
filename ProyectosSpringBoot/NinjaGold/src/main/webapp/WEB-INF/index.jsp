<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div id="container">
        <div id="header">
            <h1>Your Gold:</h1>
            <p id="counter" >${count}</p>
            <form id="form1" action="reset" method="post">
            	<button id="reset">reset</button>
            </form>
        </div>
        <div id="mid">
            <div class="box">
                <h2 class="titulo">Farm</h2>
                <h4 class="apuesta1">(earn 10-20 gold)</h4>
                <form action="random1" method="post">
                    <button id="find" type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="box">
                <h2 class="titulo">Cave</h2>
                <h4 class="apuesta2">(earn 5-10 gold)</h4>
                <form action="random2" method="post">
                    <button id="find" type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="box">
                <h2 class="titulo">House</h2>
                <h4 class="apuesta3">(earn 2-5 gold)</h4>
                <form action="random3" method="post">
                    <button id="find" type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="box">
                <h2 class="titulo">Casino!</h2>
                <h4 class="apuesta4">(earns/takes 0-50 gold)</h4>
                <form action="random4" method="post">
                    <button id="find" type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="box box5">
                <h2 class="titulo">Spa</h2>
                <h4 class="apuesta5">(pay 5-50 gold)</h4>
                <form action="random5" method="post">
                    <button id="find" type="submit">Pay Gold!</button>
                </form>
            </div>
            
        </div>
        <div id="footer">
            <h3> Activities:</h3>
            <div id="valoresgold">
	            <c:forEach var="mensaje" items="${mensajes}">
	                <p class="${mensaje[1]}">${mensaje[0]}</p>
	            </c:forEach>            
            </div>
        </div>
    </div>
    <script src="/js/script.js"></script>
</body>
</html>