package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BillServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("product");
		int price = Integer.parseInt(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));

		int total = price * quantity;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>Bill</h2>");
		out.println("<p>Product: " + name + "</p>");
		out.println("<p>Price: " + price + "Rs</p>");
		out.println("<p>Quantity: " + quantity + "</p>");
		out.println("<p>Total: " + total + "Rs</p>");
	}
}