package drill_array2;

public class BiArray {
	
	//Filed
	private int[] array1;
	private int[] array2;
	
	//Constructor
	public BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}
	
	//Method
	public boolean areSumsEqual() {
		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);
		
//		boolean areSumsEqual = (sum1 == sum2);		
//		return areSumsEqual;
		return sum1 == sum2; // 위 두 줄 간소화
	}
	
	private int calculateSum(int[] array) {
		int sum = 0;
		for(int value:array) {
			sum += value;
		}
		return sum;
	}

}
