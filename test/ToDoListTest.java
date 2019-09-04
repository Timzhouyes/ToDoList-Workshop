import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures

	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
		ToDoList toDoList = new ToDoList();
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		ToDoList toDoList = new ToDoList();		
		Task task=new Task("This is a test task");
		toDoList.addTask(task);
		try {
			assertEquals(toDoList.getTask("This is a test task"), task);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testgetStatus() {
		ToDoList toDoList=new ToDoList();
		toDoList.status=true;
		assertEquals(toDoList.status, true);
	}
	@Test
	public void testRemoveTask() throws Exception {
		ToDoList toDoList=new ToDoList();
		Task task=new Task("this is a task");
		toDoList.addTask(task);
		toDoList.removeTask(task.getDescription());
		try {
			assertEquals(toDoList.getTask(task.getDescription()), new Exception("Empty tasks"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testGetCompletedTasks() {
		ToDoList toDoList=new ToDoList();
		Task task=new Task("This is a task",true);
		Task task1=new Task("This is another task",true);
		toDoList.addTask(task1);
		toDoList.addTask(task);
		assertEquals(toDoList.getAllTasks(), toDoList.getCompletedTasks());
	}
}
