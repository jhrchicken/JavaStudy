package ex03operator;

public class E03BeekyoOperator {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		/*
		비교연산자 : 두 개의 변수를 서로 비교하여 값이 크거나 같은지를 판단하는 연산자이다.
		! : 부정연산자로 다른지를 판단한다. (not)
		== : 같은지를 판단한다.
		 */
		if (num1 > num2) {
			System.out.println("num1 이 더 큽니다.");
		} else {
			System.out.println("num2 가 더 큽니다.");
		}
		
		if (num1 != num2) {
			System.out.println("num1과 num2 는 다르다.");
		} else {
			System.out.println("num1과 num2 는 같다.");
		}
	}

}
