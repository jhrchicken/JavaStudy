package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		int i = 0, j = 0;

		do {
			j = 5;
			while (j > i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		} while (i < 5);

	}

}
