package hospital;

import java.util.List;

public class Department {
	
	public String name;
	public String timings;
	public String doctor;
	public int floorNumber;
	public Patient patient;
	
	public static Department getInstance() {
		return new Department();
	}
	
//	public abstract void savePatient(Patient patient);
//	
//	public abstract List<Patient> getPatient();
}
