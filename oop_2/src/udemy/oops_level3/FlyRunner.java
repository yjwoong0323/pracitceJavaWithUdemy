package udemy.oops_level3;

interface Flyable{
	void fly();
}

class Bird implements Flyable{
	public void fly() {
		System.out.println("With Wings");
	}
}

class Aeroplane implements Flyable{
	public void fly() {
		System.out.println("With fuel");
	}
}

public class FlyRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
		
		for(Flyable object : flyingObjects) {
			object.fly();
		}
	}

}
