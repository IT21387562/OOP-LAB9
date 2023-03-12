package Ex4;

public class Student {
	
	int studentID;
	Double gpa;
	String name;
	
	//Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentID, Double gpa, String name) {
		super();
		this.studentID = studentID;
		this.gpa = gpa;
		this.name = name;
	}

	//Setters and getters
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
