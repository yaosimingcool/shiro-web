<%@page pageEncoding="UTF-8" %>
<html>
    <head>
        <title>登陆</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/user/login" method="post">
            username：<input type="text" name="username"/><br/>
            password：<input type="password" name="password"/><br/>
            <input type="submit" value="登陆"/><br/>
        </form>
    </body>

</html>