<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header>
	<nav class="navbar navbar-expand-lg navbar-light" style="background : linear-gradient(135deg, rgb(115, 143, 254), rgb(69, 94, 222));">
		<div class="collapse navbar-collapse" id="navbarContext">
			<a class="navbar-brand" style="color : white;" href="${pageContext.request.contextPath}/home.jsp">Orkut Clone</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContext" aria-controls="#navbarContext" aria-expanded="false" aria-label="Alternar navegação">
				<span class="navbar-toggler-icon"></span>
			</button>
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" style="color : white;" href="${pageContext.request.contextPath}/home.jsp">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" style="color : white;" href="${pageContext.request.contextPath}/profile.jsp">Profile</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" style="color : white;" href="${pageContext.request.contextPath}/friends.jsp">Friends</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" style="color : white;" href="${pageContext.request.contextPath}/messages.jsp">Messages</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" style="color : white;" href="${pageContext.request.contextPath}/communities.jsp">Communities</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" style="color : white;" href="${pageContext.request.contextPath}/search.jsp">Search</a>
				</li>
			</ul>
		</div>
	</nav>
</header>