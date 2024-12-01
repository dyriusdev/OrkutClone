<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Orkut Clone - Login</title>
	</head>
	<body>
		<div>
			<form action="${pageContext.request.contextPath}/LoginController" method="post">
				<div>
					<label for="email">Email :</label>
					<input type="email" id="email" name="email">
				</div>
				<div>
					<label for="password">Password :</label>
					<input type="password" id="password" name="password">
				</div>
				<input type="submit" value="Sign-In">
				<a href="${pageContext.request.contextPath}/register.jsp">Don't have an account ? Create</a>
				<%
					if (request.getAttribute("message") != null) {
						%>
							<p><%= request.getAttribute("message") %><p>
						<%
					}
				%>
			</form>
		</div>
	</body>
</html>