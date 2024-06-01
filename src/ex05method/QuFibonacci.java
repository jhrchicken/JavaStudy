package ex05method;

import java.util.Scanner;

public class QuFibonacci {

	public static void main(String[] args) {
		// 정수를 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int N = scanner.nextInt();
		// 입력한 정수의 개수만큼 항목을 출력하기
		for (int i = 1; i < N; i++) {
			System.out.print(fibonacciProgression(i) + ", ");
		}
		System.out.print(fibonacciProgression(N));
	}

	// fibonacciProgression() : 피보나치 수열을 반환하는 메소드
	static int fibonacciProgression(int N) {
		if (N == 1) {
			return 0;
		}
		if (N == 2) {
			return 1;
		}
		return fibonacciProgression(N - 2) + fibonacciProgression(N - 1);
	}
}
