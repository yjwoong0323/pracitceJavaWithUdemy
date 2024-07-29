package drill_biNumber;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber number = new BiNumber(18, 48);
		
		System.out.println(number.calculateLCM());
		System.out.println(number.calculateGCD());
	}

}
