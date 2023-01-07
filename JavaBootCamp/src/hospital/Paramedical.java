package hospital;

public class Paramedical extends Department {

	private static Paramedical instance = null;
	
	private Paramedical(){
		this.name = "Paramedical";
		this.timings = "6:00 PM to 3:00 AM";
		this.doctor = "Dr. Shafaat";
		this.floorNumber = 3;
		this.patient = new Patient();
	}


	public static Department getInstance() {
		if(instance == null) {
			instance = new Paramedical();
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
