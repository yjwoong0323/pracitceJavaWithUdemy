package udemy.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("james", 90, 92, 93);
		
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks : " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks : " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks : " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks : " + minimumMark);
		
		BigDecimal average = student.getAverageMark();
		System.out.println("Average : " + average);
		
		student.addNewMark(77);
		
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		
		System.out.println(student);
	}

}