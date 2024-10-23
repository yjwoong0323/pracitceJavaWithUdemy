package udemy.oops_level2;

public class Rectangle {
	//Fields
	private int width;
	private int length;

	//Constructors
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	//Methods
	public int getWidth() {
		return width;
	}	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getPerimeter() {
		return 2*(width+length);
	}
	public int getArea() {
		return width*length;
	}
	
	public String toString() {
		return String.format("width - %d, length - %d, perimeter - %d, area - %d",
				width, length, getPerimeter(), getArea());
	}

}
