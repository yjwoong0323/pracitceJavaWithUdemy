package drill_factorial;

public class FactorialCalculatorRunner {

	public static void main(String[] args) {
		System.out.println(FactorialCalculatorRunner.calculateFactorial(5));
	}

	// Methods
	
	// Factorial 계산
	public static int calculateFactorial(int number) {
		if (number < 0) {
			return -1;
		}
		
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}