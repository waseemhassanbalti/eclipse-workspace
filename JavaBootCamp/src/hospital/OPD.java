package hospital;

import java.util.ArrayList;
import java.util.List;

public class OPD extends Department{
	
	private static OPD instance = null;
	
	private OPD(){
		this.name = "OPD";
		this.doctor = "Dr. ALI";
		this.timings = "9:00 AM to 3:00 PM";
		this.floorNumber = 1;
		this.patient = new Patient();
	}

	public static Department getInstance() {
		if(instance == null) {
			instance = new OPD();
		}
		return instance;
	}

//	@Override
//	public void savePatient(Patient patient) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Patient> getPatient() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}
