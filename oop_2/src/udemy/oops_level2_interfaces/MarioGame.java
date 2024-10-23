package udemy.oops_level2_interfaces;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Goes into a hole");
	}
	public void left() {
		System.out.println("Move back");
	}
	public void right() {
		System.out.println("Go Forward");
	}
	
}
