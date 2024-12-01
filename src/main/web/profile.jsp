<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	if (session == null || session.getAttribute("id") == null) {
		response.sendRedirect("index.jsp");
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Orkut Clone - Profile</title>
	</head>
	<body>
	</body>
</html>