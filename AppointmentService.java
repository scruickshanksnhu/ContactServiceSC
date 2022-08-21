//Steven Cruickshank
//SNHU

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {

	//private array list of appointments
	private ArrayList<Appointment> arr = new ArrayList<Appointment>();

	//used to make sure the input is valid. 
	//Then the arraylist will add the appointment
	public void addApp(String id, Date date, String d) {
		Appointment a = new Appointment(id, date, d);

		if (a.getAppointment() == null || a.getAppointment().length() > 10) {
			System.out.println("ERROR. Please use valid inputs");
		} else {
			arr.add(a);
		}
		
	}
	
	//Used to locate and delete appointments
	public void deleteAppointment (String id) {
		
		for (int i=0;i<arr.size();i++)
		{
			if (arr.get(i).getAppointment().equals(id)){
				System.out.println("THIS CONTACT ID HAS BEEN LOCATED, AND WILL BE DELETED.");
				arr.remove(arr.get(i));
			}
			else {
				System.out.println("NO CONTACT WITH THIS ID HAS BEEN FOUND.");
			}
		}
		
	}
	
}
