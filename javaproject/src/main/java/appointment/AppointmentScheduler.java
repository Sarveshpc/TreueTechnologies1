package appointment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppointmentScheduler {
	    private Map<String, ServiceProviders> serviceProviders;

	    public AppointmentScheduler() {
	        this.serviceProviders = new HashMap<>();
	    }

	    public void addServiceProvider(String name) {
	        serviceProviders.put(name, new ServiceProviders());
	    }

	    public boolean bookAppointment(String serviceProviderName, String date, String time) {
	        ServiceProviders serviceProvider = serviceProviders.get(serviceProviderName);
	        if (serviceProvider != null) {
	            serviceProvider.addAppointment(date, time);
	            return true;
	        }
	        return false;
	    }

	    public List<Appointment> viewAppointments(String serviceProviderName, String date) {
	        ServiceProviders serviceProvider = serviceProviders.get(serviceProviderName);
	        if (serviceProvider != null) {
	            return serviceProvider.getAppointmentsForDate(date);
	        }
	        return new ArrayList();
	    }

	    public void confirmAppointment(String serviceProviderName, String date, String time) {
	        ServiceProviders serviceProvider = serviceProviders.get(serviceProviderName);
	        if (serviceProvider != null) {
	            serviceProvider.confirmAppointment(date, time);
	        }
	    }
}
	    

	  