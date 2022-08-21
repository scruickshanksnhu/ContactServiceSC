//Steven Cruickshank
//SNHU
//July 23, 2022
public class Task {

	private String taskID;
	private String Name;
	private String Desc;
	
	public Task() {}
	
	//Default constructor takes inputs ID, Name, and Desc strings
	//and runs them through the associated filter functions.
	public Task(String x, String y, String z) {
		assignID(x);
		assignName(y);
		assignDesc(z);
	}
	
	//When assignging the unique ID, checks to make sure ID string is
	//less than 10 chars and not null. otherwise assigns the taskID.
	public boolean assignIDTest (String id) {
		
		if (id.length() > 10 || id == null){
			System.out.println("ID IS NULL OR GREATER THAN 10 CHARS");
			return false;
		} else {
			this.taskID = id;
			return true;
		}
	}
	public void assignID (String id) {
		
			if (id.length() > 10 || id == null){
				System.out.println("ID IS NULL OR GREATER THAN 10 CHARS");
			} else {
				this.taskID = id;
		}
	}
	
	//When assigning name, checks to make sure String is smaller than 20 chars
	//and that the name field isn't null.
	public void assignName (String name) {
		
		if (name.length() > 20 || name == null){
			System.out.println("NAME IS NULL OR GREATER THAN 20 CHARS");
		} else {
			this.Name = name;
		}
	}
	
	//When assigning desc, checks to make sure the String is smaller than 50 chars, 
	//and that the String is not null.
	public void assignDesc (String desc) {
		
			if (desc.length() > 50 || desc == null){
				System.out.println("DESC IS NULL OR GREATER THAN 50 CHARS");
			} else {
				this.Desc = desc;
		}
	}
	
	public String getID() {
		return this.taskID;
	}


	
}
