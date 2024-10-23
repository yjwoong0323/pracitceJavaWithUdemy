package udemy.oops_level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress_james = new Address("118-3", "SeoulCity", "05310");
		Customer customer = new Customer("james", homeAddress_james);
		System.out.println(customer + "\n");
		
		Address workAddress_james = new Address("118-3 for work", "SeoulCity", "05310");
		customer.setWorkAddress(workAddress_james);
		System.out.println(customer + "\n");
	}

}
