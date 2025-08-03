package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuantityServlet extends HttpServlet {
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String productParam = request.getParameter("product");
		String[] product = productParam.split(":");
		
		String name = product[0];
		String price = product[1];
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Enter Quantity</h2>");
        out.println("<form action='bill' method='post'>");
        out.println("Quantity: <input type='number' name='quantity' required><br><br>");
        out.println("<input type='hidden' name='name' value='" + name + "'>");
        out.println("<input type='hidden' name='price' value='" + price + "'>");
        out.println("<input type='submit' value='Generate Bill'>");
        out.println("</form>");
	}
}