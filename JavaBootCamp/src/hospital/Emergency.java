package hospital;

public class Emergency extends Department {

	private static Emergency instance = null;
	
	private Emergency(){
		this.name = "Emergency";
		this.timings = "8:00 AM to 2:00 PM";
		this.doctor = "Dr. Saad";
		this.floorNumber = 2;
		this.patient = new Patient();
	}


	public static Department getInstance() {
		if(instance == null) {
			instance = new Emergency();
		}
		return instance;
	}

	@Override
	public void displayDepartment() {
		System.out.println("\n---------- Department Details --------------");
		System.out.println("Department Name : "+ this.name);
		System.out.println("Department Timing : "+ this.timings);
		System.out.println("Department Doctor : "+ this.doctor);
		System.out.println("Department FloorNumber : "+ this.floorNumber);
		System.out.println("\nAll Patient List of Department "+this.name);
		this.patient.displayPatients();
	}
}
