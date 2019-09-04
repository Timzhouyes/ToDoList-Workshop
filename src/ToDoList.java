import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();
public boolean status;

	public void addTask (Task task) {
		tasks.put(task.getDescription(), task);
	}
	public void completeTask(String description) {
		Task task=tasks.get(description);
		task.setComplete(true);
		tasks.put(task.getDescription(), task);
	}
	public boolean getStatus(String description) {
		return status;
	}
	public Task getTask(String description) throws Exception {
		// Add code here
		if(tasks.size()==0)
			throw new Exception("Empty tasks");
		return tasks.get(description);
	}
	public Task removeTask(String description) throws Exception {
		// Add code here
		if(tasks.size()==0)
			throw new IllegalAccessException("No task here");
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();
	}
	public Collection<Task> getCompletedTasks() {
		// Add code here
		Collection<Task> completedTasks=this.getAllTasks();
		for(Task task:completedTasks)
		{
			if(task.isComplete()==false)
				completedTasks.remove(task);
		}
		return completedTasks;
	}
}
