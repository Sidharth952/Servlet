<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Send Parameters to Servlet</title>
</head>
<body>
<center>
    <h1>Send Parameters to Servlet</h1>

    <form action="demo" method="post">
        <label for="param1">Number 1: </label>
        <input type="text" id="param1" name="p1" />
        <br><br>
        <label for="param2">Number 2: </label>
        <input type="text" id="param2" name="p2" />
        <br><br>
        <button type="submit">Send</button>
    </form>
</center>
</body>
</html>