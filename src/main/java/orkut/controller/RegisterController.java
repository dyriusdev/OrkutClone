package orkut.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import orkut.dao.UserDAO;
import orkut.model.User;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean status = !((firstName.trim().equals("")) || (lastName.trim().equals("")) || 
				(email.trim().equals("")) || (password.trim().equals("")));
		request.removeAttribute("message");
		if (!status) {
			request.setAttribute("message", "Re-enter fields");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} else {
			UserDAO dao = new UserDAO();
			boolean result = dao.register(new User(firstName, lastName, email, password));
			if (result) {
				User user = dao.getUserByEmail(email);
				HttpSession session = request.getSession(true);
				session.setMaxInactiveInterval(1800);
				session.setAttribute("id", user.getId());
				response.sendRedirect("home.jsp");
			}
		}
	}
}