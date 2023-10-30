package com.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostRegistrationServlet
 */
@WebServlet("/PostRegistrationServlet")
public class PostRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PostRegistrationServlet() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String course = request.getParameter("course");
		String gender = request.getParameter("gender");
		String languages = request.getParameter("languages");
		String transportation = request.getParameter("transportation");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1> Registration Form </h1>");
		out.println("<h3>Form submitted successfully !</h3>");

	}

}
