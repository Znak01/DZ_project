package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7043075057049136648L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fName = req.getParameter("firstName");
		String lName = req.getParameter("lastName");
		String login = req.getParameter("login");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		System.out.println(fName + " " + lName + " " + login + " " +  email + " " +  password + " ");
		
		resp.sendRedirect(req.getContextPath() + "/");
	}

	
	
}
