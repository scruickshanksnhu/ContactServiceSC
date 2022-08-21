//Steven Cruickshank
//SNHU July 17, 2022 


import java.util.ArrayList;



public class ContactService {

	public static void main(String[] args) {
    }
	
	private String tenChars = "          ";
	private String thirtyChars = "                              ";
	private Contact c = null; 
	//array for iterating through current contacts
	ArrayList<Contact> arr = new ArrayList<Contact>();
	
	//add contact with filters 
	public void addContact (String id, String fn, String ln, String ph, String add) {
		
		
		
		if (id.compareTo(tenChars) < 0 || fn.compareTo(tenChars) < 0 || ln.compareTo(tenChars) > 0 || ph.compareTo(tenChars) == 0 
				|| add.compareTo(thirtyChars) < 0 || id == null || fn == null || ln == null || ph == null || add == null ) {
		
			if (id.compareTo(tenChars) < 0){
				for (int i=0;i<arr.size();i++)
				{
					if (arr.get(i).getID().equals(id)){
						System.out.println("THIS CONTACT ID ALREADY EXISTS!");
					}
					else {
						arr.add(new Contact(id, fn, ln, ph, add));
					}
				}
			} else {
				System.out.println("YOUR ID CANNOT BE LONGER THAN TEN CHARACTERS.");
			}
		} else {
			System.out.println("PLEASE VERIFY YOUR INPUT.");
		}
	}
	
	//delet contact with filters
	public void deleteContact (String id) {
		
		for (int i=0;i<arr.size();i++)
		{
			if (arr.get(i).getID().equals(id)){
				System.out.println("THIS CONTACT ID HAS BEEN LOCATED, AND WILL BE DELETED.");
				arr.remove(arr.get(i));
			}
			else {
				System.out.println("NO CONTACT WITH THIS ID HAS BEEN FOUND.");
			}
		}
		
	}
	
	//update first name with filters
	public void updateFirstName(String f, String id, Contact c) {
		
		if (f == null || f.compareTo(tenChars) > 0) {
			for (int i=0;i<arr.size();i++)
			{
				if (arr.get(i).getID().equals(id)){
					arr.get(i).setFirst(f);
			}
			}
		} else {
			System.out.println("FIRST NAME CANNOT BE GREATER THAN 10 CHARS.");
		}
	}
	
	//update last name with filters
	public void updateLastName(String l, String id, Contact c) {
		
		if (l == null || l.compareTo(tenChars) > 0) {
			for (int i=0;i<arr.size();i++)
			{
				if (arr.get(i).getID().equals(id)){
					arr.get(i).setLast(l);
				}
			}
		} else {
			System.out.println("LAST NAME CANNOT BE GREATER THAN 10 CHARS.");

		}
	}
	
	//update phone with filters
	public void updatePh(String p, String id, Contact c) {
		
		if (p != null || p.compareTo(tenChars) == 0) {
			for (int i=0;i<arr.size();i++)
			{
				if (arr.get(i).getID().equals(id)){
					arr.get(i).setPhone(p);
				}
			}
		} else {
			System.out.println("PHONE NUMBER MUST BE EXACTLY TEN CHARACTERS.");

		}
		
	}
	
	//update address with filters
	public void updateAdd(String a, String id, Contact c) {
		
		if (a != null || a.compareTo(thirtyChars) > 0) {
		for (int i=0;i<arr.size();i++)
			{
				if (arr.get(i).getID().equals(id)){
					arr.get(i).setAdd(a);
			}
			}
		} else {
			System.out.println("ADDRESS NEEDS TO BE NO LONGER THAN 30 CHARS.");

		}
	}
}
