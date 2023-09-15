package javaproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/confirmbooking")
public class BookingConfrimationServlets extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 int userId = Integer.parseInt(req.getParameter("user_id"));
	        int spotId = Integer.parseInt(req.getParameter("spot_id"));

		super.doPost(req, resp);
		
		System.out.println("Booking Tickets Successfully submitted!");
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("confirmbooking.html");
		
		dispatcher.include(req, resp);
		
		
	}

}
