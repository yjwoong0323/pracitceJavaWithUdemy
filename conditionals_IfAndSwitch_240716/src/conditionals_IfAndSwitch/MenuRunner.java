package conditionals_IfAndSwitch;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		int number1 = scnr.nextInt();
		
		System.out.println("Enter number2: ");
		int number2 = scnr.nextInt();
		
		System.out.println("Choices Available are ");
		
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.println("Enter Choice: ");
		int choice = scnr.nextInt();
		
		System.out.println("Your choice are ");
		System.out.println("Number1 = " + number1);
		System.out.println("Number2 = " + number2);
		System.out.println("Choice = " + choice);
		
		//performOperationUsingNestedIfElse(number1, number2, choice);
		//performOperationUsingSwitch(number1, number2, choice);
	}

	// Method
	private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
		if(choice == 1) {
			System.out.println("Result = " + (number1+number2));
		} else if(choice == 2) {
			System.out.println("Result = " + (number1-number2));
		} else if(choice == 3) {
			System.out.println("Result = " + (number1/number2));
		} else if(choice == 4) {
			System.out.println("Result = " + (number1*number2));
		} else {
			System.out.println("Invalid Operation!");
		}
	}
	
	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1 :
			System.out.println("Result = " + (number1+number2));
			break;
		case 2 :
			System.out.println("Result = " + (number1-number2));
			break;
		case 3 :
			System.out.println("Result = " + (number1/number2));
			break;
		case 4 :
			System.out.println("Result = " + (number1*number2));
			break;
		default :
			System.out.println("Invalid Operation!");
			break;
		}
	}
}
