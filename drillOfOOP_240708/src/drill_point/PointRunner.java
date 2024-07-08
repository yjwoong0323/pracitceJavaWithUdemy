package drill_point;

public class PointRunner {

	public static void main(String[] args) {
		Point p1 = new Point(3,4);
		Point p2 = new Point(10,10);
		
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		p1.move(3, 3);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		p1.move(-10, -10);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		System.out.println(p2.distanceTo(20, 20));
		System.out.println(p2.distanceTo(10, 20));
	}

}