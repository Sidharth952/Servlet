<!DOCTYPE html>
<html>
    <head>
        <style>
            label{
                font-size:20px;
                font-weight:bold;
            }
            input{
                border-radius:5px;
                margin-left:30px;
            }
        </style>
        <title>Registration Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div style="background-color:#7099fd; width:30%; margin-left:35%">
            <form action="reg" method="post" style="text-align:center;">
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
        </div>
    </body>
</html>