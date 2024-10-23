package udemy.oops_level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("LG", 10, "White");
		
		fan.switchOn();
		System.out.println(fan);
		
		fan.setSpeed((byte)3);
		System.out.println(fan);
		
		fan.switchOff();
		System.out.println(fan);
	}

}
