<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Orkut Clone - Login</title>
		<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" href="css/main.css">
		<script src="js/bootstrap/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="col-sm 10 offset-sm 1 text-center">
				<form action="${pageContext.request.contextPath}/LoginController" method="post">
					<div>
						<label for="email">Email :</label>
						<input class="form-control" type="email" id="email" name="email" required>
					</div>
					<div>
						<label for="password">Password :</label>
						<input class="form-control" type="password" id="password" name="password" required>
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
		</div>
		
		<%@include file="components/footer.jsp" %>
	</body>
</html>