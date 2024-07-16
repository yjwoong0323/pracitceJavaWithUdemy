package conditionals_IfAndSwitch;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(6));
		System.out.println(isWeekDay(6));
	}

	// Methods

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		//case 0:
		//case 6:
		//	return false; // 코드의 간소화를 위해 이 세줄 생략 가능
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}
		return true;
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wesnesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}
		return "Invalid Day !";
	}
}
