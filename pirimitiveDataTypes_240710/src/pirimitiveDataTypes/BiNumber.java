package pirimitiveDataTypes;

public class BiNumber {
	//Field
	private int num1, num2;
	
	//Constructor
	public BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Method
	public int add() {
		return num1 + num2;
	}
	
	public int multiply() {
		return (num1*num2);
	}
	
	public void doubleValue() {
		this.num1 *= 2;
		this.num2 *= 2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}
