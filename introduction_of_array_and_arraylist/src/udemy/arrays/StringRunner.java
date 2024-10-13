package udemy.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
		String longestDay = "";
		for(String day:daysOfWeek) {
			if(day.length()>longestDay.length()) {
				longestDay = day;
			}
		}
		System.out.println("Day with Most number of Character is " + longestDay);
		
		for(int i=daysOfWeek.length-1; i>=0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
}
