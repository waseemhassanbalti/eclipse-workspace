package hospital;

public class OPD extends Department{
	
	private static OPD instance = null;
	
	private OPD(){
		this.name = "OPD";
		this.timings = "9:00 AM to 3:00 PM";
		this.doctor = "Dr. ALI";
		this.floorNumber = 1;
		this.patient = new Patient();
	}


	public static Department getInstance() {
		if(instance == null) {
			instance = new OPD();
		}
		return instance;
	}

	@Override
	public void displayDepartment() {
		System.out.println("---------- Department Details --------------");
		System.out.println("Department Name : "+ this.name);
		System.out.println("Department Timing : "+ this.timings);
		System.out.println("Department Doctor : "+ this.doctor);
		System.out.println("Department FloorNumber : "+ this.floorNumber);
		System.out.println("All Patient List of Department "+this.name);
		this.patient.displayPatients();
	}
}
