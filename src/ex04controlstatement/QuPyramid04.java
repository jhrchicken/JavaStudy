package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {

		// 증가하는 별 출력하기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 감소하는 별 출력하기
		for (int i = 4; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
