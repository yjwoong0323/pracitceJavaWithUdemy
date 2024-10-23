package udemy.oops_level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book1 = new Book("A1", "Harry Potter_1", "j.k");
		
		book1.addReview(new Review("Anna", "Great Book!", 5));
		book1.addReview(new Review("James", "Disappointed", 3));
		
		System.out.println(book1);
	}

}
