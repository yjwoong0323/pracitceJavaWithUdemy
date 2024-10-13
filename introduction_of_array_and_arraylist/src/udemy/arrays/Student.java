package udemy.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	// Fields
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	// Constructor
	public Student(String name, int... marks) {
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	
	// Methods
	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int totalSumOfMarks = 0;
		
		for(int mark:marks) {
			totalSumOfMarks += mark;
		}
		return totalSumOfMarks;
	}

	public int getMaximumMark() {
		return Collections.max(marks); // Using 'Collections'
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark < minimum)
				minimum = mark;
		}
		return minimum;
	}

	public BigDecimal getAverageMark() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}
	
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
	
	public String toString() {
		return name + marks;
	}

}
