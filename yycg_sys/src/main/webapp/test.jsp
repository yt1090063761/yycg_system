<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/13
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
路径<%=request.getContextPath()%>
<c:set value="${pageContext.request.contextPath }" var="s"/>
值：${s}
<c:set value="http://localhost:8080" var="url"></c:set>
${url}
</body>
</html>
