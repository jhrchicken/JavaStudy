package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			// 앞쪽 공백 출력하기
			for (int j = 0; j < (4 - i); j++) {
				System.out.print(" ");
			}

			// 별 출력하기
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			// 뒤쪽 공백 출력하기
			for (int j = 0; j < (4 - i); j++) {
				System.out.print(" ");
			}

			System.out.println();

		}

	}

}
