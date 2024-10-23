package udemy.oops_level2;

public class Fan {
	//Fields(State)
	private String maker;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	//Constructors
	public Fan(String maker, double radius, String color) {
		this.maker = maker;
		this.radius = radius;
		this.color = color;
	}
	
	//Methods
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)1);
	}
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	
	
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
				maker, radius, color, isOn, speed);
	}

}
