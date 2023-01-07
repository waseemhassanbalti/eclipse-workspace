package hospital;

public class Pharmacy extends Department {

	private static Pharmacy instance = null;
	
	private Pharmacy(){
		this.name = "Pharmacy";
		this.timings = "5:00 PM to 12:00 AM";
		this.doctor = "Dr. Shahid";
		this.floorNumber = 4;
		this.patient = new Patient();
	}


	public static Department getInstance() {
		if(instance == null) {
			instance = new Pharmacy();
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
