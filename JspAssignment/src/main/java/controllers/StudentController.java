package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.StudentDao;
import models.Student;

public class StudentController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		Student student = new Student();
		student.setName(name);
		student.setEmail(email);

		try {
			StudentDao dao = new StudentDao();
			dao.insertStudent(student);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("list");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			StudentDao dao = new StudentDao();
			List<Student> students = dao.getAllStudents();
			request.setAttribute("students", students);
			RequestDispatcher rd = request.getRequestDispatcher("studentList.jsp");
			rd.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
