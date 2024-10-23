package udemy.oops_level2;

public class Review {
	//Fields
	private String id;
	private String description;
	private int rate;
	
	//Constructors
	public Review(String id, String description, int rate) {
		super();
		this.id = id;
		this.description = description;
		this.rate = rate;
	}
	
	//Methods
	public String toString() {
		return String.format("[id:%s, des:%s, rate:%s]", id, description, rate);
	}
}
