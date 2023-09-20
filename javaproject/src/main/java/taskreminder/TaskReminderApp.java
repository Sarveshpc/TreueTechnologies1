package taskreminder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.http.parser.Priority;

public class TaskReminderApp {

	    private List<Task> tasks;

	    public TaskReminderApp() {
	        this.tasks = new ArrayList<>();
	    }

	    public void createTask(String title, String description, java.util.Date date, taskreminder.Task.Priority high) {
	        tasks.add(new Task(title, description, date, high));
	    }

	    public void viewTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks found.");
	            return;
	        }

	        for (int i = 0; i < tasks.size(); i++) {
	            System.out.println("Task " + (i + 1) + ":");
	            System.out.println(tasks.get(i));
	            System.out.println("-------------------------");
	        }
	    }

	    public void markTaskAsCompleted(int taskIndex) {
	        if (taskIndex >= 0 && taskIndex < tasks.size()) {
	            tasks.get(taskIndex).markAsCompleted();
	            System.out.println("Task marked as completed.");
	        } else {
	            System.out.println("Invalid task index.");
	        }
	    }

		public void createTask(String title, String description, java.util.Date parse,
				taskreminder.TaskReminderDriver.Priority high) {
			// TODO Auto-generated method stub
			System.out.println("it's method created!");
			
		}
}

	   