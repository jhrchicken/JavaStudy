package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		// 결과를 저장할 변수
		int result;

		// 2단부터 9단까지 출력
		for (int i = 2; i <= 9; i++) {
			result = i;
			// 각 단마다 9줄 출력
			for (int j = 1; j <= 9; j++) {
				System.out.print(i);
				// 첫번째 출은 X 1 출력
				if (j == 1) {
					System.out.print(" X 1");
				}
				// 그 이후 줄은 줄 수 만큼 X 단 출력
				else {
					for (int k = 1; k < j; k++) {
						System.out.print(" X " + i);
					}
					result *= i;
				}
				// 각 줄마다 결과 출력
				System.out.println(" = " + result);
			}
		}

	}

}