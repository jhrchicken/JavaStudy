package ex05method;

public class QuTemperature {

	public static void main(String[] args) {

	}

	// celsiusToFahrenheit() : 섭씨를 화씨로 변환하는 메소드
	static double celsiusToFahrenheit(double celsius) {
		return 1.8 * celsius + 32;
	}

	// fahrenheitToCelsius() : 화씨를 섭씨로 변환하는 메소드
	static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
}
