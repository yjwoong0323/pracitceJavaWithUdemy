package udemy.oops_level3;

abstract class Animal{
	abstract void bark();
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Bow");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("Meow");
	}
}


public class AnimalRunner {	
	public static void main(String[] args) {
		Animal[] animals = {new Dog(), new Cat()};
		
		for(Animal animal : animals) {
			animal.bark();
		}
	}

}
