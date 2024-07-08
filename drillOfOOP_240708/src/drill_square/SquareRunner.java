package drill_square;

public class SquareRunner {

	public static void main(String[] args) {
		Square square_1 = new Square(2);
		Square square_2 = new Square(-2);
		
		System.out.println(square_1.calculateArea());
		System.out.println(square_1.calculatePerimeter());
		
		System.out.println(square_2.calculateArea());
		System.out.println(square_2.calculatePerimeter());
	}

}