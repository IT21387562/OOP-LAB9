package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> Studentlist = new ArrayList<>();
		
		Studentlist.add(new Student(100,2.5,"mithila"));
		Studentlist.add(new Student(101,3.3,"Amandi"));
		Studentlist.add(new Student(102,3.0,"Hardik"));
		
		//traversing - iterating
		
		for(Student s : Studentlist) {
			System.out.println("Student id : "+ s.getStudentID());
			System.out.println("Student name : "+ s.getName());
			System.out.println("Student gpa : "+ s.getGpa());
			System.out.println();
		}
	}

}
