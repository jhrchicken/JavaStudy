package ex05method;

public class QuCircleCalculator {

	public static void main(String[] args) {
		System.out.println("원의 둘레 (5.5) : " + circleRound(5.5));
		System.out.println("원의 넓이 (5.5) : " + circleArea(5.5));

	}

	// circleArea() : 원의 넓이를 계산하여 반환하는 메소드
	static double circleArea(double radius) {
		return 3.14 * radius * radius;
	}

	// circleRound() : 원의 둘레를 계산하여 반환하는 메소드
	static double circleRound(double radius) {
		return 2 * 3.14 * radius;
	}
}