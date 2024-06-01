package ex05method;

public class QuFindPrimeNumber {

	public static void main(String[] args) {
		// 1부터 100 사이의 소수를 모두 출력 (1은 소수가 아니므로 제외)
		for (int i = 2; i <= 100; i++) {
			if (isPrimeNumber(i) == true) {
				System.out.println(i);
			}
		}
	}

	// isPrimeNumber() : 소수인지 아닌지를 판단하는 메소드
	static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
