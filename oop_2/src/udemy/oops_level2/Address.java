package udemy.oops_level2;

public class Address {
	//Fields
	private String line1;
	private String city;
	private String zip;
	
	//Constructors
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	//Fields
	public String toString() {
		return String.format("%s %s (%s)", city, line1, zip);
	}
	
	
}
