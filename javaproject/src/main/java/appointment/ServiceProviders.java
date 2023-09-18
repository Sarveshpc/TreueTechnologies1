package appointment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceProviders {
	
	    private String name;
	    private Map<String, List<Appointment>> appointments;

	    public void ServiceProvider(String name) {
	        this.name = name;
	        this.appointments = new HashMap<>();
	    }

	    public void addAppointment(String date, String time) {
	        if (!appointments.containsKey(date)) {
	            appointments.put(date, new ArrayList<>());
	        }
	        appointments.get(date).add(new Appointment(date, time, 0));
	    }

	    public List<Appointment> getAppointmentsForDate(String date) {
	        return appointments.getOrDefault(date, new ArrayList<>());
	    }

	    public void confirmAppointment(String date, String time) {
	        List<Appointment> appointmentsForDate = appointments.get(date);
	        if (appointmentsForDate != null) {
	            for (Appointment appointment : appointmentsForDate) {
	                if (appointment.getTime().equals(time)) {
	                    appointment.isConfirmed();
	                }
	            }
	        }
	    }
}
	    