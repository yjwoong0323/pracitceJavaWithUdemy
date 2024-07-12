package pirimitiveDataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel());
		// a, e, i ,o, u and Capitals
		System.out.println(myChar.isConsonunt());
		// NOT Vowel
		System.out.println(myChar.isDigit());
		// 0 between 9
		System.out.println(myChar.isAlphabet());
		// a~z or A~Z
		
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
