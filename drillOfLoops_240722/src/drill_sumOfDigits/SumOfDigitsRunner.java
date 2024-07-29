package drill_sumOfDigits;

public class SumOfDigitsRunner {

	public static void main(String[] args) {
		System.out.println(SumOfDigitsRunner.getSumOfDigits(1234));
	}

	// Methods
	// 숫자의 자릿수 합계 계산
	public static int getSumOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}

		int sumOfDigits = 0;

		while (number > 0) {
			int digit = number % 10; // digit = 4, 3, 2, 1
			sumOfDigits = sumOfDigits + digit; // sumOfDigits = 4, 7, 9, 10

			number = number / 10; // number = 123, 12, 1, 0
		}
		return sumOfDigits;
	}
}
