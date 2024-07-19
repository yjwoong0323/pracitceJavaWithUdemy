package loops;

import java.util.Scanner;

public class DoWhileQuestionRunner {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int number = 0;

		do {
			if (number != 0) {
				System.out.println("Cube is " + number * number * number);
			}
			System.out.print("Enter a number: ");
			number = scnr.nextInt();
		} while (number >= 0);
		System.out.println("Thank You, Have a fun!");
	}
}
