package drill_square;

public class Square {
	//Field
	private int side;

	//Constructor
	public Square(int side) {
		this.side = side;
	}
	
	//Method
	public int calculateArea() {
		if(side<0) {
			return -1;
		}
		else {
			return side*side;
		}
	}
	
	public int calculatePerimeter() {
		if(side<0) {
			return -1;
		}
		else {
			return side*4;
		}
	}
}