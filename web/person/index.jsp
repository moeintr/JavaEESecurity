<%@ page import="org.apache.catalina.realm.GenericPrincipal" %><%--
  Created by IntelliJ IDEA.
  User: amirs
  Date: 4/19/2024
  Time: 6:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  GenericPrincipal  generic= (GenericPrincipal) request.getUserPrincipal();
    out.print(generic.getName());
%>
person index
<BR/>
<a href="/logout.do">EXIT</a>
</body>
</html>
