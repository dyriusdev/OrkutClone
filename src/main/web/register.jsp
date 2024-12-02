<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Orkut Clone - Register</title>
		<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
		<script src="js/bootstrap/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="col-sm 10 offset-sm 1 text-center">
				<form action="${pageContext.request.contextPath}/RegisterController" method="post">
					<div>
						<label for="fname">First Name :</label>
						<input class="form-control" type="text" id="fname" name="fname" required>
					</div>
					<div>
						<label for="lname">Last Name :</label>
						<input class="form-control" type="text" id="lname" name="lname" required>
					</div>
					<div>
						<label for="email">Email :</label>
						<input class="form-control" type="email" id="email" name="email" required>
					</div>
					<div>
						<label for="password">Password :</label>
						<input class="form-control" type="password" id="password" name="password" required>
					</div>
					<input class="form-control" type="submit" value="Sign-Up">
					<a href="${pageContext.request.contextPath}/index.jsp">Already has an account ? Sign-In</a>
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
	</body>
</html>