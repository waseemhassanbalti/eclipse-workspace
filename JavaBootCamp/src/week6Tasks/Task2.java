package week6Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import CollectionImplementation.EMP;

class SortByFirstName implements Comparator<Employee> {

	public boolean isAsc = true;
	
	public SortByFirstName(boolean isAsc){
		this.isAsc = isAsc;
	}
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if (isAsc) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
		else {
			return o2.getFirstName().compareTo(o1.getFirstName());
		}
	}
	
}

class SortBySalary implements Comparator<Employee> {

	public boolean isAsc = true;
	
	public SortBySalary(boolean isAsc){
		this.isAsc = isAsc;
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(isAsc)
			return o1.getSalary().compareTo(o2.getSalary());
		else
			return o2.getSalary().compareTo(o1.getSalary());
	}
	
	
}

class SortByAge implements Comparator<Employee> {

	public boolean isAsc = true;
	
	public SortByAge(boolean isAsc){
		this.isAsc = isAsc;
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
	
		if(isAsc)
			return o1.getAge().compareTo(o2.getAge());
		else
			return o2.getAge().compareTo(o1.getAge());
	}
	
}

class Employee {
	
	private String firstName;
	private String lastName;
	private Integer salary;
	private Integer age;
	private Long cnic;

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getCnic() {
		return cnic;
	}
	public void setCnic(Long cnic) {
		this.cnic = cnic;
	}
	
	@Override
	public String toString() {
		//System.out.println("NAME : "+this.getFirstName()+"\nAge : "+this.getAge()+"\nSalary : "+this.getSalary());
		return "NAME : "+this.getFirstName()+"\nAge : "+this.getAge()+"\nSalary : "+this.getSalary();
	}
	
}

public class Task2 {
	
	public static void main(String[] args) {
	

		List<Employee> empList = new ArrayList();
		Employee em1 = new Employee();
		em1.setFirstName("waseem");
		em1.setAge(25);
		em1.setSalary(2000);
		
		empList.add(em1);
		
		Employee em2 = new Employee();
		em2.setFirstName("asif");
		em2.setAge(20);
		em2.setSalary(3500);
		
		empList.add(em2);
		
		Employee em3 = new Employee();
		em3.setFirstName("saleem");
		em3.setAge(27);
		em3.setSalary(3000);
		
		empList.add(em3);
		
		Employee em4 = new Employee();
		em4.setFirstName("zeeshan");
		em4.setAge(28);
		em4.setSalary(9000);
		
		empList.add(em4);
		
		
		Employee em5 = new Employee();
		em5.setFirstName("abbas");
		em5.setAge(35);
		em5.setSalary(100);
		
		empList.add(em5);

		
		Collections.sort(empList, new SortByAge(true));

		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Employee emp3 = (Employee) iterator.next();
			System.out.println(emp3);
		}
		
		
		int n1;
		System.out.println("\n\n");
		System.out.println("Enter 1 for FristName Assending");
		System.out.println("Enter 2 for FristName Dessending");
		System.out.println("Enter 3 for Salary Assending");
		System.out.println("Enter 4 for Salary dessending");
		System.out.println("Enter 5 for Age dessending");
		

		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();	
		
		if(n1 == 1) {
			Collections.sort(empList, new SortByFirstName(true));	
		}else if(n1==2) {
			Collections.sort(empList, new SortByFirstName(false));
		}else if(n1 == 3) {
			Collections.sort(empList, new SortBySalary(true));	
		}else if(n1 == 4) {
			Collections.sort(empList, new SortBySalary(false));
		}else if(n1==5) {
			Collections.sort(empList, new SortByAge(false));	
		}
		
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Employee emp3 = (Employee) iterator.next();
			System.out.println(emp3);
		}
	}
}
