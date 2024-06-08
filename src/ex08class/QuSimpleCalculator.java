package ex08class;

// 사칙연산의 결과와 각 연산이 몇 번 수행되었는지를 출력하는 계산기 클래스
class CalculatorEx {
	int cntAdd, cntMin, cntMul, cntDiv;

	// 계산의 결과를 카운트하는 멤버변수를 0으로 초기화하는 메소드
	public void init() {
		cntAdd = 0;
		cntMin = 0;
		cntMul = 0;
		cntDiv = 0;
	}

	// 덧셈을 계산하는 메소드
	public double add(double a, double b) {
		cntAdd++;
		return a + b;
	}

	// 뺄셈을 계산하는 메소드
	public double min(double a, double b) {
		cntMin++;
		return a - b;
	}

	// 곱셈을 계산하는 메소드
	public double mul(double a, double b) {
		cntMul++;
		return a * b;
	}

	// 나눗셈을 계산하는 메소드
	public double div(double a, double b) {
		cntDiv++;
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다. 다른 수를 입력하세요.");
			return 0;
		}
		return a / b;
	}

	// 각 연산이 몇 번 수행되었는지를 출력하는 메소드
	public void showOpCount() {
		System.out.println("덧셈횟수 : " + cntAdd);
		System.out.println("뺄셈횟수 : " + cntMin);
		System.out.println("곱셈횟수 : " + cntMul);
		System.out.println("나눗셈횟수 : " + cntDiv);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();

		cal.init();
		System.out.println("1 + 2 = " + cal.add(1, 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0, 5.0));
		System.out.println("100 / 25 = " + cal.div(100, 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0, 3.0));
		cal.showOpCount();
	}

}
