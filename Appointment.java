//Steven Cruickshank
//SNHU 

import java.util.Calendar;
import java.util.Date;

public class Appointment {

	//non updatable variables
	private String id;
	private Date date;
	private String description;
	
	public Appointment(String i, Date d, String desc) {
		
		//using before method, checks to make sure the received date isn't before
		//the current date
		//This also makes sure the input isn't null, and is of the proper length.
		Date check = new Date();
		if (check.before(d) == false || i.length() > 10 || i == null 
				|| d == null || desc.length() > 50 || desc == null) {
			System.out.println("ERROR: Please enter valid inputs");
		} else {
			this.id = i;
			this.date = d;
			this.description = desc;
		}
		
	}
	
	public String getAppointment() {
		return this.id;
	}
	
}
