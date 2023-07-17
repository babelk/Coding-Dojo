<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
        <p id="c1">${error}</p>
        <form  action="/resultados" method="post">
            <div id="div1">
                <label id="name1" for="name">Your Name: </label>
                <input  type="text" id="name" name="name">
            </div>
            <div id="div2">
                <label id="location1" for="location">Dojo Location: </label>
                <select name="location" id="location">
                    <option value="Vina Del Mar">Vina Del Mar</option>
                    <option value="Santiago">Santiago</option>
                    <option value="Temuco">Temuco</option>
                </select>
            </div>
            <div id="div3">
                <label id="language1" for="language">Favorite Language: </label>
                <select name="language" id="language">
                    <option value="Python">Python</option>
                    <option value="Java">Java</option>
                    <option value="PHP">PHP</option>
                </select>
            </div>
            <div id="div4">
                <label id="comment1" for="comment">Comment (optional): </label>
                <textarea name="comment" id="comment" cols="30" rows="5"></textarea>
            </div>
            <button id="btn1">Button</button>
            
		</form>
    </div>
</body>
</html>
