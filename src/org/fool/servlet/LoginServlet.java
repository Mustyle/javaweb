package org.fool.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fool.bean.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String authority = request.getParameter("authority");
		
		User user = new User();

		HttpSession session = request.getSession();

		if ("1".equals(authority)) {
			if ("zhangsan".equals(username) && "123".equals(password)) {

				user.setUsername(username);
				user.setPassword(password);
				user.setAuthority(authority);

				session.setAttribute("user", user);
				
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else {
				response.sendRedirect("login.jsp?username=" + username + "&authority=" + authority);
			}
		} else if ("2".equals(authority)) {
			// admin
			if ("lisi".equals(username) && "456".equals(password)) {

				user.setUsername(username);
				user.setPassword(password);
				user.setAuthority(authority);
				
				session.setAttribute("user", user);
				
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else {
				response.sendRedirect("login.jsp?username=" + username + "&authority=" + authority);
			}
		} else {
			response.sendRedirect("login.jsp?username=" + username + "&authority=" + authority);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
