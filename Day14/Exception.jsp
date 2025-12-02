<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String user="Vageesh" ;
	pageContext.setAttribute("user",user);
	%>
	
	<%=pageContext.getAttribute("user") %>
	<%=page.getClass() %>

</body>
</html>