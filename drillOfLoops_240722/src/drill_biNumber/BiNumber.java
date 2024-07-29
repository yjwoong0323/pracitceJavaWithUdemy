package drill_biNumber;

public class BiNumber {
	// fields
	private int number1, number2;

	// Constructor
	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	// Methods

	// Getter
	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	// 최소공배수 구하기
	public int calculateLCM() {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}

		if (number1 == 0 || number2 == 0) {
			return 0;
		}

		int max = Math.max(number1, number2);
		int lcm = max;

		while (true) {
			boolean finalLcm = lcm % number1 == 0 && lcm % number2 == 0;
			if (finalLcm) {
				return lcm;
			}
			lcm += max;
		}
	}
	
	// 최대공약수 구하기
	public int calculateGCD() {
		if (number1 == 0 || number2 == 0) {
			return 0;
		}
		if (number1 < 0 || number2 < 0) {
			return 1;
		}
		if (number1 == number2) {
			return number1;
		}
		
		int min = Math.min(number1, number2);
		
		for(int i=min; i>0; i--) {
			boolean isDivisorOfBothNumbers = number1 % i == 0 && number2 % i == 0;
			if(isDivisorOfBothNumbers) {
				return i;
			}
		}
		return -1;
	}
}
