package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewCartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        out.println("<h2>Your Cart:</h2>");

        boolean hasItems = false;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().startsWith("item")) {
                    out.println("<p>" + c.getValue() + "</p>");
                    hasItems = true;
                }
            }
        }

        if (!hasItems) {
            out.println("<p>Your cart is empty.</p>");
        }

        out.println("<br><a href='addItem.html'>Add More Items</a>");
	}
}