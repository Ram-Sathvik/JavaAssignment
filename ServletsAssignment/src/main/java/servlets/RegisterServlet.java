package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		
		out.println("<h2>Registration details:</h2>");
		out.println("<p>Name: " + name + "</p>");
		out.println("<p>Email: " + email + "</p>");
		out.println("<p>Course: " + course + "</p>");
	}
}