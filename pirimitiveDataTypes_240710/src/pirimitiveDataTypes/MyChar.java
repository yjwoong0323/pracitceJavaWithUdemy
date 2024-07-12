package pirimitiveDataTypes;

public class MyChar {
	//Field
	private char ch;
	
	//Constructor
	public MyChar(char ch) {
		this.ch = ch;
	}

	
	//Method
	public boolean isVowel() {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		else
			return false;
	}

	
	public boolean isConsonunt() {
		if(isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}
	
	public boolean isDigit() {
		if(48 <= ch && ch <= 57)
			return true;
		return false;
	}
	
	public boolean isAlphabet() {
		if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122))
			return true;
		return false;
	}


	public static void printLowerCaseAlphabets() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}


	public static void printUpperCaseAlphabets() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}
