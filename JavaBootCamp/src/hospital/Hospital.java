package hospital;

import java.util.List;
import java.util.Scanner;

public class Hospital {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Hospital Managment System");
		boolean isContinue = false;
		int input;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				
				
				System.out.println("Choose Departemnt");
				System.out.println("Press 1 for OPD");
				System.out.println("Press 2 for Emergency");
				System.out.println("Press 3 for Pharmacy");
				System.out.println("Press 4 for Paramedical");
				System.out.println("Press any key other then above for Eixt");
				
			    input = scan.nextInt();
				scan.nextLine();
				
				if(input == 1) {
					Department opd = DepartmentFactory.getDepartmentInstance("OPD");
					
					List<Patient> patientList = opd.patient.addPatients();
					
					if(patientList.size()>0)
						opd.patient.savePatient(patientList);
					
					opd.displayDepartment();
					
					isContinue = true;
				}
				
			}catch(Exception ex) {
				isContinue = false;
				System.out.println("Thank You ! ");
			}
			
		}while(isContinue);
		scan.close();
	}
}
