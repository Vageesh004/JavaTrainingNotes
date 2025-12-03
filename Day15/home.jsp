<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Check</title>
</head>
<body>
    <%
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        request.setAttribute("uname", uname);
        request.setAttribute("pwd", pwd);
    %>
 
    <c:if test="${uname=='swapna' && pwd=='swapna'}">
        <c:redirect url="success.jsp">
            <c:param name="uname" value="${uname}" />
        </c:redirect>
    </c:if>
 
    <c:if test="${uname!='swapna' || pwd!='swapna'}">
        <c:redirect url="error.jsp" />
    </c:if>
</body>
</html>
 
