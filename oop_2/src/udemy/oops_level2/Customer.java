package udemy.oops_level2;

public class Customer {
	//Fields
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//Constructors
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	//Methods
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name - %s \nhomeAddress - %s \nworkAddress - %s",
				name, homeAddress, workAddress);
	}
	
}
