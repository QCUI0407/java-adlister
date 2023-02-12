<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cui
  Date: 2/12/23
  Time: 2:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Ads</title>
</head>
<body>
    <c:forEach var="ad" items = "${ads}">
        <div class="ad">
            <h1>${ad.title}</h1>
            <p>${ad.descripion}</p>
        </div>
    </c:forEach>
</body>
</html>
