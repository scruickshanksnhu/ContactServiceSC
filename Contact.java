
//Steven Cruickshank
//July 17, 2022
// SNHU Contact Service App


public class Contact {

	
	
	//Required contact strings -- private.
	private String contactID = "";
	private String firstName = "";
	private String lastName = "";
	private String contactPh = "";
	private String contactAdd = "";
	
	
	


	

	public Contact(String id, String s, String s2, String i, String j) {
		// TODO Auto-generated constructor stub
		this.contactID = id;
		this.firstName = s;
		this.lastName = s2;
		this.contactPh = i;
		this.contactAdd = j;
	}



	//mutators for the private strings
	public String setID(String s) {
		contactID = s;
		return s;
	}
	
	public String setFirst(String f) {
		firstName = f;
		return f;
	}
	
	public String setLast(String l) {
		lastName = l;
		return l;
	}
	public String setPhone(String p) {
		contactPh = p;
		return p;
	}
	public String setAdd(String a) {
		contactAdd = a;
		return a;
	}
	
	
	
	//accessors for private strings.
	public String getID() {
		return contactID;
	}
	
	public String getFirst() {
		
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	public String getPhone() {
		return contactPh;
	}
	public String getAdd() {
		return contactAdd;
	}
	
}
