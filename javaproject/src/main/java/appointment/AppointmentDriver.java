package appointment;

import java.util.List;

public class AppointmentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        AppointmentScheduler scheduler = new AppointmentScheduler();

	        // Add service providers
	        scheduler.addServiceProvider("Provider1");
	        scheduler.addServiceProvider("Provider2");

	        // Book appointments
	        scheduler.bookAppointment("Provider1", "2023-09-20", "10:00 AM");
	        scheduler.bookAppointment("Provider1", "2023-09-20", "11:00 AM");
	        scheduler.bookAppointment("Provider2", "2023-09-20", "2:00 PM");

	        // View and confirm appointments
	        List<Appointment> appointments = scheduler.viewAppointments("Provider1", "2023-09-20");
	        for (Appointment appointment : appointments) {
	            System.out.println("Appointment: " + appointment.getDate() + " " + appointment.getTime() +
	                    " Confirmed: " + appointment.isConfirmed());
	        }

	        scheduler.confirmAppointment("Provider1", "2023-09-20", "10:00 AM");

	        System.out.println("After confirmation:");
	        appointments = scheduler.viewAppointments("Provider1", "2023-09-20");   
	        
	        for (Appointment appointment : appointments) {
	        	System.out.println("Appointment: " + appointment.getDate() + " " + appointment.getTime() +
	                    " Confirmed: " + appointment.isConfirmed());
//	        
			}
	}
	
}
