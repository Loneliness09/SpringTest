<%--
  Created by IntelliJ IDEA.
  User: Jarvis Sun
  Date: 2025/5/12
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
/hello.jsp,显示request作用域中的数据<br>
<h2>msg数据：<%=request.getAttribute("msg")%>
</h2>
<h2>fun数据：${fun}</h2>
<a href="hello.do?name=Jarvis Sun">To Home</a>
<a href="getGoods.do">goods</a>
</body>
</html>
