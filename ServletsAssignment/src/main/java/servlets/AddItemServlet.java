package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddItemServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String item = request.getParameter("item");

        Cookie cookie = new Cookie("item" + System.currentTimeMillis(), item);
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<p>Item " + item + " added to cart.</p>");
        out.println("<a href='addItem.html'>Add More</a><br>");
        out.println("<a href='view'>View Cart</a>");
	}
}