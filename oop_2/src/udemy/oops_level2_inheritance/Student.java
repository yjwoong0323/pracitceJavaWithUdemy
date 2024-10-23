package udemy.oops_level2_inheritance;

public class Student extends Person {
	//Fields
	private String college;
	private int year;
	
	//Constructors
	public Student(String name, String college) {
		super(name);
		this.college = college;
	}
	
	//Methods
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
