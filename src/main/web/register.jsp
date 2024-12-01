<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Orkut Clone - Register</title>
	</head>
	<body>
		<div>
			<form action="${pageContext.request.contextPath}/RegisterController" method="post">
				<div>
					<label for="fname">First Name :</label>
					<input type="text" id="fname" name="fname">
				</div>
				<div>
					<label for="lname">Last Name :</label>
					<input type="text" id="lname" name="lname">
				</div>
				<div>
					<label for="email">Email :</label>
					<input type="email" id="email" name="email">
				</div>
				<div>
					<label for="password">Password :</label>
					<input type="password" id="password" name="password">
				</div>
				<input type="submit" value="Sign-Up">
				<a href="${pageContext.request.contextPath}/index.jsp">Already has an account ? Sign-In</a>
			</form>
		</div>
	</body>
</html>