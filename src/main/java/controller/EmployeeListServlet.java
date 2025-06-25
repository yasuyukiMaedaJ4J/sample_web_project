package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

public class EmployeeListServlet extends HttpServlet {
	private static List<Employee> employees = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("employees", employees);
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee_list.jsp");
		dispatcher.forward(request, response);
	}

	public static void addEmployee(Employee employee) {
		employees.add(employee);
	}
}
