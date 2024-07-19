package loops;

public class WhileNumberPlayer {
	// Fields
	private int limit;

	// Constructor
	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	// Methods
	public void printSquaresUpToLimit() {
		int i = 1;
		while ((i * i) < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubesUpToLimit() {
		int i = 1;
		while ((i * i * i) < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}
}
