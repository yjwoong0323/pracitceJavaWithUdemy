package drill_numberOfDigits;

public class NumberOfDigitsRunner {

	public static void main(String[] args) {
		System.out.println(NumberOfDigitsRunner.getNumberOfDigits(123456));
	}

	// Methods
	// 숫자의 자릿수 찾기
	public static int getNumberOfDigits(int number) {
		if (number < 0) {
			return -1;
		}

		if (number == 0) {
			return 1;
		}

		int noOfDigit = 0;

		while (number > 0) { // 123456, 12345, 1234, 123, 12, 1
			number = number / 10; //12345, 1234, 123, 12, 1, 0
			noOfDigit++; // 1, 2, 3, 4, 5, 6
		}
		return noOfDigit;
	}
}