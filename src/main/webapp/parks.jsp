<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cui
  Date: 1/30/23
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NP</title>
</head>
<body>
<h1>${username} NP</h1>
<ul>
    <c:forEach var="park" items="${parks}">
        <li>${park}</li>
    </c:forEach>
</ul>
</body>
</html>
