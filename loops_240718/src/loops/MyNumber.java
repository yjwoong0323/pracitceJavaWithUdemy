package loops;

public class MyNumber {

	// Fields
	private int number;

	// Constructor
	public MyNumber(int number) {
		this.number = number;
	}

	// Methods
	public boolean isPrime() {
		if (number < 2) {
			return false;
		} // Guard Check : 본 메소드 전에 넣는 값이 유효한 지 확인

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sumOfDivisors = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				sumOfDivisors += i;
			}
		}
		return sumOfDivisors;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
