//Steven Cruickshank
//SNHU
//July 23, 2022


import java.util.ArrayList;

public class TaskService {

	private Task t;
	ArrayList <Task> tasks = new ArrayList<Task>();
	
	//adds a task using a unique string id. check to see if input matches validations, then assigns the Task object. This
	//is then added to an ArrayList of tasks for future editing/deletion.
	public void addTask(String id) {
		if (id.length() > 10 || id == null){
			System.out.println("ID IS NULL OR GREATER THAN 10 CHARS");
		} else {
			this.t.assignID(id);
			tasks.add(this.t);		
		}
			
	}
	
	//deletes task if the unique string ID is found
	
	public void deleteTask(String id) {
		
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getID() == id) {
				tasks.remove(i);
				System.out.println("MATCH FOUND. REMOVING TASK.");
			} else {
				System.out.println("NO MATCH. SEARCHING NEXT MATCH.");
			}
		}
	}
	
	//This will update the Tasks name/desc using two extra parameters, but only if the unique string ID is found.
	public void updateTask(String id, String name, String desc) {
		
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getID() == id) {
				tasks.get(i).assignName(name);
				tasks.get(i).assignDesc(desc);
				System.out.println("MATCH FOUND. UPDATING FIELDS.");
			} else {
				System.out.println("NO MATCH. SEARCHING NEXT MATCH.");
			}
		}
	}
	
	
}
	
	

