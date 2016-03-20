<%--
  Created by IntelliJ IDEA.
  User: brunyatko
  Date: 20.03.16
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true"%>
<html>
<head>
    <title>Login</title>

</head>
<body>

<div class="container" style="width: 300px;">
    <c:url value="/j_spring_security_check" var="loginUrl" />
    <form action="${loginUrl}" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="j_username" placeholder="Email address" required autofocus value="ivan">
        <input type="password" class="form-control" name="j_password" placeholder="Password" required value="secret">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </form>
</div>


</body>
</html>
