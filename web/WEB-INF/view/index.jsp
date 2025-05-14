<%--
  Created by IntelliJ IDEA.
  User: Jarvis Sun
  Date: 2025/5/12
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个springmvc</title>
</head>
<body>
<%
    if (request.getAttribute("name") != null) {
        %>

<h1>hello, ${name}的第一个springmvc</h1>

<%
    }
%>

<a href="hello.do">发起一个hello.do的请求</a>
</body>
</html>
