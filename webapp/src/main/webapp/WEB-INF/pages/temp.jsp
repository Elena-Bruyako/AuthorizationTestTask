<%--
  Created by IntelliJ IDEA.
  User: brunyatko
  Date: 20.03.16
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auth App</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <jsp:useBean id="allUsers" scope="request" type="java.util.List"/>
</head>
<body>

<c:forEach items="${allUsers}" var="users">
    <tr>
        <td class="id">${users.id}</td>
        <td class="login">${users.login}</td>
        <td class="password">${users.password}</td>
    </tr>
</c:forEach>

</body>
</html>
