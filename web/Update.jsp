<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update</title>
    </head>
    <body>
        <form action="ud" method="post" style="text-align:center;">
            <h1>Registration</h1>
            <label for="user_id">Id</label>
            <input type="text" name="idno" id="user_id" style="margin-left:90px">
            <br><br>
            <label for="nam">Name</label>
            <input type="text" name="name" id="nam" style="margin-left:60px">
            <br><br>
            <label for="pho">Phone</label>
            <input type="text" name="phone" id="pho" style="margin-left:60px">
            <br><br>
            <label for="email">E-mail Id</label>
            <input type="text" name="email" id="email">
            <br><br>
            <label for="pass">Password</label>
            <input type="password" name="password" id="pass">
            <br>
            <p>Already have an Account? <a href="Login.jsp">Login</a></p>
            <input type="submit">
            <br><br>
        </form>
    </body>
</html>
