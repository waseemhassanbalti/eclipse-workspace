package hospital;

import java.util.List;
import java.util.Scanner;

public class Hospital {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Hospital Managment System");
		boolean isContinue = false;
		
		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Choose Departemnt");
				System.out.println("Press 1 for OPD");
				System.out.println("Press 2 for Emergency");
				System.out.println("Press 3 for Pharmacy");
				System.out.println("Press 4 for Paramedical");
				System.out.println("Press any key other then above for Eixt");
				int input = scan.nextInt();
				
				if(input == 1) {
					Department opd = DepartmentFactory.getDepartmentInstance("OPD");
					List<Patient> patientList = opd.patient.addPatients();
					opd.patient.savePatient(patientList);
					opd.patient.displayPatients(opd.patient.getPatient());
					isContinue = true;
				}
				scan.close();
				
			}catch(Exception ex) {
				isContinue = false;
				System.out.println("Thank You ! ");
			}
			
		}while(isContinue);
		
	}
}
