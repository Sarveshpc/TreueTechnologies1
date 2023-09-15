package javaproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchParkingServlets extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String location = req.getParameter("location");
	        // Implement logic to search for available parking spots based on location

	        // Return the results to the user
		System.out.println("successfully searching location!");
	}
}
	    
		
		
		
   
		
		

