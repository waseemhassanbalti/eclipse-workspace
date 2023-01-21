package week7Day2;

import java.util.ArrayList;
import java.util.List;


interface IshowAll {
	
	public void showAll(List<Student> st);
}

public class StudentRunner {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList();
		
		Student s1 = new Student();
		s1.setName("waseem");
		s1.setAge(22);
		s1.setSemester("1th");
		
		studentList.add(s1);
		
		Student s2 = new Student();
		s2.setName("ali");
		s2.setAge(20);
		s2.setSemester("2th");
		
		studentList.add(s2);
		
		Student s3 = new Student();
		s3.setName("zeeshan");
		s3.setAge(25);
		s3.setSemester("3th");
		
		studentList.add(s3);
		
		Student s4 = new Student();
		s4.setName("saleem");
		s4.setAge(18);
		s4.setSemester("4th");
		
		studentList.add(s4);
		
		Student s5 = new Student();
		s5.setName("basit");
		s5.setAge(28);
		s5.setSemester("5th");
		
		studentList.add(s5);
		
		
		Student student = new Student();
		student.showAll(studentList);
		System.out.println("\n\nSort By Name ");
		student.sortStudentByName(studentList);
		
		
		
	}

}
