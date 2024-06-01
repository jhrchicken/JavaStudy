package ex05method;

public class QuSimpleOperation {

	public static void main(String[] args) {
		arithmetic(100, 77);
	}

	// arithmetic() : 사칙연산의 결과를 출력하는 메소드
	static void arithmetic(int a, int b) {
		System.out.println("덧셈결과 -> " + (a + b));
		System.out.println("뺄셈결과 -> " + (a - b));
		System.out.println("곱셈결과 -> " + (a * b));
		System.out.println("나눗셈 몫 -> " + (a / b));
		System.out.println("나눗셈 나머지 -> " + (a % b));
	}

}