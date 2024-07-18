package drill_weatherAdviser;

public class WeatherAdviserRunner {

	public static void main(String[] args) {
		System.out.println(provideWeatherAdvisory(-3));
		System.out.println(provideWeatherAdvisory(0));
		System.out.println(provideWeatherAdvisory(8));
		System.out.println(provideWeatherAdvisory(12));
		System.out.println(provideWeatherAdvisory(21));
	}

	// Methods
	public static String provideWeatherAdvisory(int temperature) {
		if (temperature < 0) {
			return "It's freezing! Wear a heavy coat.";
		}
		if (temperature <= 10) {
			return "It's cold! Bundle up.";
		}
		if (temperature <= 20) {
			return "It's cool! A light jacket will do.";
		}
		return "It's warm! Enjoy the day.";
	}
}
