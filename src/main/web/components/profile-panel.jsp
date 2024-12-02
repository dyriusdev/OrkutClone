<%@page import="orkut.model.User"%>
<%@page import="orkut.dao.UserDAO"%>

<div class="col-md-2 d-none d-md-block" style="padding : 0">
	<div class="bg-white p-2 mr-1" style="border-radius : 7px">
		<div id="profile-panel">
			<div class="col-9">
				<%
					UserDAO dao = new UserDAO();
					User user = dao.getUserById(session.getAttribute("id").toString());
				%>
				
				<img alt="user-image" src="">
				<p class="mt-2 mb-1 info-none" style="font-size : 1em">
					<%= user.getFirstName() + " " + user.getLastName() %>
				</p>
				
				<!-- Lateral menu -->
				<div class="mt-2 mb-2"></div>
			</div>
		</div>
	</div>
</div>