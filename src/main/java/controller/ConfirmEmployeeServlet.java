package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

public class ConfirmEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		Employee emp = new Employee(name, email);
		EmployeeListServlet.addEmployee(emp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("complete.jsp");
		dispatcher.forward(request, response);
	}
}
