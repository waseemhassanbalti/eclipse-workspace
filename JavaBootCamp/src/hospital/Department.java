package hospital;

public abstract class Department {
	
	public String name;
	public String timings;
	public String doctor;
	public int floorNumber;
	public Patient patient;
	
	public abstract void displayDepartment();
}
