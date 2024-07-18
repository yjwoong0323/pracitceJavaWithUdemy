package drill_myChar;

public class MyCharRuuner {

	public static void main(String[] args) {
		System.out.println(isVowel('e'));
	}

	// Methods
	public static boolean isVowel(char ch) {
		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':
		case 'A', 'E', 'I', 'O', 'U':
			return true; // Code Simplification Using 'FallThrough'
		default:
			return false;
		}
	}

}
