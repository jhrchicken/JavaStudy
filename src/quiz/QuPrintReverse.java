package quiz;

public class QuPrintReverse {

	public static void main(String[] args) {

		int i = 1;
		int flag = 0;

		do {
			System.out.print(i + " ");
			if (flag == 0) {
				i++;
			}
			if (i == 100) {
				flag = 1;
				System.out.print(i);
				System.out.println();
			}
			if (flag == 1) {
				i--;
			}
		} while (i > 0);
	}

}
