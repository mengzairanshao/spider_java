<%--
  Created by IntelliJ IDEA.
  User: han
  Date: 2019/10/6
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<%
    String s= (String) request.getAttribute("message");
%>
<%=s%>
</body>
</html>
