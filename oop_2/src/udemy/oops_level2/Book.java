package udemy.oops_level2;

import java.util.ArrayList;

public class Book {
	//Fields
	private String code;
	private String title;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	//Constructors
	public Book(String code, String title, String author) {
		this.code = code;
		this.title = title;
		this.author = author;
	}

	//Methods
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("code-%s \ntitle-%s \nauthor-%s \nreview-%s", code, title, author, reviews);
	}

}
