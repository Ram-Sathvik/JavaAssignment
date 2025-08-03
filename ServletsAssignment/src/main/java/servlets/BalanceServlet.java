package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BalanceServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String username;
        if (session != null) {
            username = (String) session.getAttribute("username");
        }
        else {
            username = null;
        }

        if (username != null) {
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            out.println("<h2>No user is logged in!</h2>");
            out.println("<a href='login.html'>Login</a>");
        }
	}
}