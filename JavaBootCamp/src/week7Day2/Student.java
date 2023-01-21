package week7Day2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	private String name;
	private String semester;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void showAll(List<Student> stud) {
		for (Student iterable_element : stud) {
			System.out.println("Name : "+ iterable_element.getName());
			System.out.println("Age : "+ iterable_element.getAge());
			System.out.println("Semester : "+ iterable_element.getSemester());
		}
	}
	
	public void showAllByLamda(List<Student> stud) {
		stud.forEach(s -> System.out.println("Name By Lambda"+s.getName()+
											"\nAge By Lambda"+s.getAge()+
											"\nSemester By Lambda "+s.getSemester()));
	}
	
	public void sortStudentByName(List<Student> stud) {
		
		Collections.sort(stud, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				
				return s1.name.compareTo(s2.name);
			}
			
		});
		
		for (Student iterable_element : stud) {
			System.out.println("Name : "+ iterable_element.getName());
			System.out.println("Age : "+ iterable_element.getAge());
			System.out.println("Semester : "+ iterable_element.getSemester());
		}
	}
	
	

}
