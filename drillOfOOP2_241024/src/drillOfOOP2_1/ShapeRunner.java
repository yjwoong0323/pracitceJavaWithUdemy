package drillOfOOP2_1;

abstract class Shape {
	//Fields
	protected String name;
	
	//Constructor
	public Shape(String name) {
		this.name = name;
	}
	
	//Abstract Methods
	public abstract double calculateArea();
}

class Circle extends Shape{
	//Fields
	private double radius;
	
	//Constructor
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	//Methods
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{
	//Fields
	private double length;
	private double width;
	
	//Constructor
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	
	//Methods
	public double calculateArea() {
		return length*width;
	}
}

public class ShapeRunner {	
	public static void main(String[] args) {
		Shape circle = new Circle("circle", 5.0);
		Shape rectangle = new Rectangle("rectangle", 5.0, 2.0);
		
		System.out.println(circle.calculateArea());
		System.out.println(rectangle.calculateArea());
	}

}