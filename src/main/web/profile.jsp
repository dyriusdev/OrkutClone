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
		<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" href="css/main.css">
		<script src="js/bootstrap/bootstrap.min.js"></script>
	</head>
	<body>
		<%@include file="components/header.jsp" %>
		<%@include file="components/profile-panel.jsp" %>
		
		<div class="container">
		</div>
	</body>
</html>