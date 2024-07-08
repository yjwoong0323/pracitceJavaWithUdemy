package drill_RGB;

public class RGB {
	//Field
	private int red;
	private int green;
	private int blue;
	
	//Constructor
	public RGB(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	//Method
	public int getRed() {
		return this.red;
	}
	public int getGreen() {
		return this.green;
	}
	public int getBlue() {
		return this.blue;
	}
	
	public void invert() {
		this.red = 255-this.red;
		this.green = 255-this.green;
		this.blue = 255-this.blue;
	}
}