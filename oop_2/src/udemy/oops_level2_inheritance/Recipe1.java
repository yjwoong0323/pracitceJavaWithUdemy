package udemy.oops_level2_inheritance;

public class Recipe1 extends AbstractRecipe {
	
	//Methods
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}
	void doTheDish() {
		System.out.println("Do the dish");
	}
	void cleanUp() {
		System.out.println("Cleanup the utensils");
	}

}
