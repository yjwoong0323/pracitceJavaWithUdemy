package udemy.oops_level2_inheritance;

public class Person extends Object {
	//Fields
	private String name;
	private String email;
	private String phoneNumber;
	
	//Constructors
	public Person(String name) {
		System.out.println("Person Constructor");
//(auto)super(); // Calling Constructor of SuperClass
		this.name = name;
	}
	
	//Methods
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
    public String toString() {
        return name + " " + email + " " + phoneNumber;
    }

	
	
}
