package ex05method;

public class QuSymmetry {

	public static void main(String[] args) {
		rotationSymmetryByWhile(8);
		System.out.println();
		rotationSymmetryByFor(4);

	}

	// rotationSymmetryByWhile() : while 문으로 작성된 회전대칭 모양을 출력하는 메소드
	public static void rotationSymmetryByWhile(int N) {
		int i = 0;
		while (i < N) {
			int j = 0;
			while (j < N) {
				if (j == (N - i - 1)) {
					System.out.print(" 1");
				} else {
					System.out.print(" 0");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

	// rotationSymmetryByFor() : for 문으로 작성된 회전대칭 모양을 출력하는 메소드
	public static void rotationSymmetryByFor(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j == (N - i - 1)) {
					System.out.print(" 1");
				} else {
					System.out.print(" 0");
				}
			}
			System.out.println();
		}
	}

}
