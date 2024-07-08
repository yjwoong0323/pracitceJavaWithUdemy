package drill_RGB;

public class RGBRunner {

	public static void main(String[] args) {
		RGB color = new RGB(255, 0, 0);
		
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());
		
		color.invert();
		
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());
	}

}