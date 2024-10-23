package udemy.oops_level2_inheritance;

public class RecipeWithMicrowave extends AbstractRecipe {
	
	//Methods
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("Put it in the microwave");
	}
	void cleanUp() {
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off the microwave");
	}

}
