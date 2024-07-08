package drill_point;

public class Point {
	//Field
	private int x;
	private int y;
	
	//Constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Method
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public double distanceTo(int x2, int y2) {
		int diffX = x2-x;
		int diffY = y2-y;
		
		return Math.sqrt(diffX*diffX + diffY*diffY);
	}
}