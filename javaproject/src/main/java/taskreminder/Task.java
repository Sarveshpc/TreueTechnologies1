package taskreminder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import taskreminder.TaskReminderDriver.Priority;


	public class Task {
	    private String title;
	    private String description;
	    private Date dueDate;
	    private boolean isCompleted;
	    private Priority priority;

	    public Task(String title, String description, Date dueDate, Priority high) {
	        this.title = title;
	        this.description = description;
	        this.dueDate = dueDate;
	        this.isCompleted = false;
	        this.priority = priority;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public Date getDueDate() {
	        return dueDate;
	    }

	    public boolean isCompleted() {
	        return isCompleted;
	    }

	    public void markAsCompleted() {
	        isCompleted = true;
	    }

	    public Priority getPriority() {
	        return priority;
	    }

	    @Override
	    public String toString() {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        return "Title: " + title + "\n" +
	                "Description: " + description + "\n" +
	                "Due Date: " + dateFormat.format(dueDate) + "\n" +
	                "Priority: " + priority + "\n" +
	                "Status: " + (isCompleted ? "Completed" : "Not Completed");
	    }
	    
	    enum Priority {
	        HIGH, MEDIUM, LOW
	    }
	
}
	