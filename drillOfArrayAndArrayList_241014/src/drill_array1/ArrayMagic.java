package drill_array1;

import java.util.ArrayList;
import java.util.List;

public class ArrayMagic {
	
	public static void main(String[] args) {
		System.out.println(ArrayMagic.doesHaveElementGreaterThan(new int[] {11,20,21}, 12));
		System.out.println(ArrayMagic.findSecondLargestElement(new int[] {10,14,11,4,2}));
		System.out.println(ArrayMagic.isSorted(new int[] {1,2,3,4,5,1}));
		System.out.println(ArrayMagic.reverseArray(new int[] {1,4,6,8,0}));
		System.out.println(ArrayMagic.determineAllFactors(6));
		System.out.println(ArrayMagic.determineMultiples(3, 20));
	}
	//Method
	public static boolean doesHaveElementGreaterThan(int[] array, int number) {
		for(int value:array) {
			if(value > number)
				return true;
		}
		return false;
	}
	
	public static int findSecondLargestElement(int[] array) { // 3 5 8 8
		if(array.length < 2)
			return -1;
		
		int largestOne = Integer.MIN_VALUE;
		int secondLargestOne = Integer.MIN_VALUE;
		
		for(int value:array) {
			if(value>largestOne) {
				secondLargestOne = largestOne; // -256 3 5
				largestOne = value; // 3 5 8
			}else if(value>secondLargestOne && value != largestOne) {
				secondLargestOne = value;
			}
		}
		if(secondLargestOne == Integer.MIN_VALUE)
			return -1;
		return secondLargestOne;
	}
	
	public static boolean isSorted(int[] array) {
		if(array.length <=1) {
			return true;
		}
		
		for(int i=0; i<array.length-1; i++) {
			if(array[i+1] < array[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] reverseArray(int[] array) {
		if(array.length <= 1) {
			return array;
		}
		
		int start = 0;
		int end = array.length-1;
		
		int[] reversedArray = new int[array.length];
		
		while(start <= end) { // 1 4 6 8 0,       0 4, 1 3, 2 2, 3 1
			reversedArray[start] = array[end]; // 0,8,6, ,
			reversedArray[end] = array[start]; //  , ,6,4,1
			
			start ++;
			end --;
		}
		return reversedArray;
	}
	
	public static List<Integer> determineAllFactors(int number){
		List<Integer> factors = new ArrayList<>();
		
		if(number <= 0) {
			return factors;
		}
		
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}
	
	public static List<Integer> determineMultiples(int number, int limit){
		List<Integer> multiples = new ArrayList<>();
		
		if(number<=0 || limit<=0) {
			return multiples;			
		}
		
		for(int i=1; i*number<=limit; i++) { // 3 6 9 12 15 18
				multiples.add(i*number);
			}
		return multiples;
		}
	}
