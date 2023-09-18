package appointment;
import java.util.*;
public class Appointment {

	
	    private String date;
	    private String time;
	    private boolean confirmed;
	    private int Appointments;

	    public Appointment(String date, String time, int Appointments) {
	        this.date = date;
	        this.time = time;
	        this.confirmed = false;
	        this.Appointments = Appointments;
	    }

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public boolean isConfirmed() {
			return confirmed;
		}

		public void setConfirmed(boolean confirmed) {
			this.confirmed = confirmed;
		}

		public int getAppointments() {
			return Appointments;
		}

		public void setAppointments(int appointments) {
			Appointments = appointments;
		}
}

	   
	

	

	