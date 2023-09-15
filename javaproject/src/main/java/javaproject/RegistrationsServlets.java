package javaproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationsServlets extends HttpServlet  {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String username = req.getParameter("username");
	      String password = req.getParameter("password");
	      String email = req.getParameter("email");

//		super.doPost(req, resp);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("register.html");
		
	   dispatcher.forward(req, resp);
//	   
	}

}
