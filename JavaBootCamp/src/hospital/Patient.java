package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
	
	public String name;
	public int age;
	public String occupation;
	public List<Patient> patientList;
	
	Patient(){
		name = "";
		age = 0;
		occupation = "";
		patientList = new ArrayList<Patient>();
	}
	
	Patient(String _name, int _age, String _occupation){
		name = _name;
		age = _age;
		occupation = _occupation;
		patientList = new ArrayList<Patient>();
	}
	
	public List<Patient> addPatients(){
		List<Patient> patients = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		if(patientList.size()<2) {
			try {
				for(int i = 0; i<2 ; i++) {
					
					System.out.println("\nPatient "+ (i+1));
					System.out.print("Enter Name : ");
					String pName = scan.nextLine();
					System.out.print("Enter Age : ");
					int pAge = Integer.parseInt(scan.nextLine());
					System.out.print("Enter Occupation : ");
					String pOccupation = scan.nextLine();
					patients.add(new Patient(pName, pAge, pOccupation));
					
				}
			}catch(Exception ex) {
				System.out.println("Invalid input");
			}
		}
		scan.close();
		return patients;
	}
	
	public  void savePatient(List<Patient> patients) {
		patientList = new ArrayList<Patient>();
		for(Patient obj : patients) {
			patientList.add(obj);
		}
	}
	
	public List<Patient> getPatient(){
		return patientList;
	}
	
	public void displayPatients() {
		int count = 1;
		for(Patient patient : patientList ) {
			System.out.println("Patient "+(count++)+" "+patient.toString());
		}
	}

	@Override
	public String toString() {
		return "Name : "+this.name+" Age : "+this.age+" Occupation : "+this.occupation+"";
	}
}
