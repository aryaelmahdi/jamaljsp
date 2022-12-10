<%-- 
    Document   : login
    Created on : Jul 5, 2022, 7:55:30 PM
    Author     : Wikon3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <jsp:include page='layouts/headgame.jsp'>
            <jsp:param name="title" value="Valorant" />
        </jsp:include>
    </head>

<body>
    <jsp:include page='layouts/navbarlogin.jsp'></jsp:include>

    <div class="col-12" id="data2">
        <div class="row background-data">
            <h2>Masukkan Data Anda</h2>
            <form method="POST" action="login">
                <div class="col-12 ">
                <p>Username</p>
                <input type="text" class="input-submit" id="nama" placeholder="Username" name="loginid" required>
            </div>
            <div class="col-12">
                <p>Password</p>
                <input type="password"  class="input-submit" id="uid" placeholder="Password" name="password" required>
            </div>
            <div class="col-12">
                <div class="row">
                    <button type="submit" class="input-submit2">submit</button>
                </div>
            </div>
            </form>
        </div>
        <br>
        <br>
        <br>
        <br>
        <br>
    </div>
    <jsp:include page='layouts/footer.jsp'></jsp:include>

    <script src="public/assets/backend/myscripts.js"></script>
    

</body>
</html>
