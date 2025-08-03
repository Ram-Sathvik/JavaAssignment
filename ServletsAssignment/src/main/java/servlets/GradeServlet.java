package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GradeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = (String) request.getAttribute("name");
		int marks = (int) request.getAttribute("marks");
		
		String grade;
		if(marks >= 90)
			grade = "A";
		else if(marks >= 80)
			grade = "B";
		else if(marks >= 70)
			grade = "C";
		else if(marks >= 60)
			grade = "D";
		else if(marks >= 50)
			grade = "E";
		else
			grade = "F";
		
        out.println("<h2>Student Grade</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Marks: " + marks + "</p>");
        out.println("<p>Grade: " + grade + "</p>");
	}
}