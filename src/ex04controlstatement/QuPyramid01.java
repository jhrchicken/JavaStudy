package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		int i = 0, j = 0;

		while (i < 5) {
			j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
