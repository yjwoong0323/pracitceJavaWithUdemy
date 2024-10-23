package udemy.oops_level2_inheritance;

public class Employee extends Person {
	//Fields
	private String title;
	private String employerName;
	private char employeeGrade;
	private int salary;
	
	//Constructors
	public Employee(String name, String title) {
		super(name); //Implicit invoke
		this.title = title;
		System.out.println("Employee Constructor");
	}
	
	//Methods
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employerName;
	}
	public void setEmployer(String employer) {
		this.employerName = employer;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("name : %s \nEmail : %s \nPhoneNumber : %s \ntitle : %s \nemployer : %s \nemployeeGrade : %c \nsalray : %d",
				super.getName(), super.getEmail(), super.getPhoneNumber(), title, employerName, employeeGrade, salary);
//		return super.toString() + title + ~..
	}
	
	
	
}
