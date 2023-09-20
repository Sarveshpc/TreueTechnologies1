package taskreminder;

import java.text.SimpleDateFormat;

import org.apache.tomcat.util.http.parser.Priority;

import com.google.protobuf.TextFormat.ParseException;

public class TaskReminderDriver {
	

	    public static void main(String[] args) throws ParseException, java.text.ParseException {
	        TaskReminderApp taskApp = new TaskReminderApp();

	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	        taskApp.createTask("Finish project", "Complete the coding and documentation", dateFormat.parse("2023-10-15"), Priority.HIGH);
	        taskApp.createTask("Buy groceries", "Milk, eggs, bread", dateFormat.parse("2023-09-30"), Priority.MEDIUM);
	        taskApp.createTask("Exercise", "Go for a run", dateFormat.parse("2023-09-25"), Priority.LOW);

	        taskApp.viewTasks();

	        // Mark a task as completed
	        taskApp.markTaskAsCompleted(1);
	        taskApp.viewTasks();
	    }
	    
	    enum Priority {
	        HIGH, MEDIUM, LOW
	    }
}
	    
	   