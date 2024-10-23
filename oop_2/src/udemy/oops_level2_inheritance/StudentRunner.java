package udemy.oops_level2_inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("james");
//		student.setEmail("yjwoong0323@gmail.com");
		
//		Person person = new Person();
//		person.setName("james");
//		person.setEmail("gmail");
//		person.setPhoneNumber("010");
		
		Employee employee = new Employee("james", "Programmer");
//		employee.setName("james");
		employee.setEmail("yjwoong0323@gmail.com");
		employee.setPhoneNumber("010 6298 3040");
		employee.setTitle("Programmer");
		employee.setEmployer("king");
		employee.setEmployeeGrade('A');
		employee.setSalary(4000);
		
		System.out.println(employee);
	}

}
