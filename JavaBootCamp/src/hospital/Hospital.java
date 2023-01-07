package hospital;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

enum Depart {
	_OPD(OPD.getInstance(),1),
	_Emergency(Emergency.getInstance(),2),
	_Pharmacy(Pharmacy.getInstance(),3),
	_Paramedical(Paramedical.getInstance(),4);
	
	private  Department dept;
	private int val;
	private static Map<Integer,Depart> deptMap = new HashMap<Integer, Depart>();
	Depart(Department d, int v){
		dept = d;
		val = v;
	}
	
	Department getDetp() {
		return dept;
	}
	int getval() {
		return val;
	}
	
	public static Department valueOf(int value) {
		for(Depart d: Depart.values()) {
			if(d.getval() == value) {
				return d.getDetp();
			}
		}
		return null;
	}
}

public class Hospital {
	
	public static void takeInput(Department department) {
		List<Patient> patientList = department.patient.addPatients();
		
		if(patientList.size()>0)
			department.patient.savePatient(patientList);
		
		department.displayDepartment();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Hospital Managment System");
		boolean isContinue = false;
		int input;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				
				
				System.out.println("\nChoose Departemnt");
				System.out.println("Press 1 for OPD");
				System.out.println("Press 2 for Emergency");
				System.out.println("Press 3 for Pharmacy");
				System.out.println("Press 4 for Paramedical");
				System.out.println("Press any key other then above for Eixt");
				
				input = scan.nextInt();
				
				
				Department opd = Depart.valueOf(input);//  DepartmentFactory.getDepartmentInstance("OPD");
				Hospital.takeInput(opd);
//				isContinue = true;
				
//				if(input == 1) {
//					Department opd = Depart._OPD.getDetp();//  DepartmentFactory.getDepartmentInstance("OPD");
//					Hospital.takeInput(opd);
//					isContinue = true;
//				}else if(input == 2) {
//					Department opd = Depart._Emergency.getDetp();//DepartmentFactory.getDepartmentInstance("Emergency");
//					Hospital.takeInput(opd);
//					isContinue = true;
//					
//					isContinue = true;
//					
//				}else if (input == 3) {
//					Department opd = Depart._Pharmacy.getDetp();//DepartmentFactory.getDepartmentInstance("Pharmacy");
//					Hospital.takeInput(opd);
//					isContinue = true;
//					
//					isContinue = true;
//					
//				}else if(input == 4) {
//					Department opd =  Depart._Paramedical.getDetp(); //DepartmentFactory.getDepartmentInstance("Paramedical");
//					Hospital.takeInput(opd);
//					isContinue = true;
//				}else {
//					System.out.println("Thank You ! ");
//					isContinue = false;
//				}
				
			}catch(Exception ex) {
				isContinue = false;
				ex.printStackTrace();
			}
			
		}while(isContinue);
		scan.close();
	}
}
