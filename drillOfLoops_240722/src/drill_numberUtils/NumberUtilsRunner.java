package drill_numberUtils;

public class NumberUtilsRunner {

	public static void main(String[] args) {
		System.out.println(NumberUtilsRunner.getLastDigit(123));
		System.out.println(NumberUtilsRunner.reverseNumber(123));
	}

	// Methods

	// 숫자의 마지막 자리 찾기
	public static int getLastDigit(int number) {
		if (number < 0) {
			return -1;
		}

		int lastDigit = number % 10;

		return lastDigit;

	}

	// 숫자 반전하기
	public static int reverseNumber(int number) {
		if (number < 0) {
			return -1;
		}
		
		if (number == 0) {
			return 0;
		}
		
		int reversedNumber = 0;

		while (number > 0) { // 123 ,12, 1
			int digit = number % 10; // 3, 2, 1

			reversedNumber = (reversedNumber * 10) + digit; // 3, 32, 321
			number = number / 10; // 12, 1, 0
		}
		return reversedNumber;
	}
}