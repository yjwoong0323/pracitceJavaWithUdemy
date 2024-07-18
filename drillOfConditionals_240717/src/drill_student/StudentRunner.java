package drill_student;

public class StudentRunner {

	public static void main(String[] args) {
		System.out.println(assignGrade(101));
		System.out.println(assignGrade(91));
		System.out.println(assignGrade(49));
	}
	
	// Methods
	public static char assignGrade(int marks) {
		if (marks < 0 || 100 < marks) {
			return 'X';
		}
		if (90 <= marks) {
			return 'A';
		}
		if (80 <= marks) {
			return 'B';
		}
		if (70 <= marks) {
			return 'C';
		}
		if (60 <= marks) {
			return 'D';
		}
		if (50 <= marks) {
			return 'E';
		}
		if (50 > marks) {
			return 'F';
		}
		return 'Y';
		// return이 if문 안에 있다면 굳이 else를 쓸 필요가 없다.
	}

}
