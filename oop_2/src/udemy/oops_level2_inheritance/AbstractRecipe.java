package udemy.oops_level2_inheritance;

public abstract class AbstractRecipe {
	
	//Methods
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();
}
