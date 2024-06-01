package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

		int sum, i;

		// while 문으로 작성
		sum = 0;
		i = 1;
		while (i <= 100) {
			if ((i % 3 == 0 || i % 7 == 0) && (i % 21 != 0)) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		// do-while 문으로 작성
		sum = 0;
		i = 1;
		do {
			if ((i % 3 == 0 || i % 7 == 0) && (i % 21 != 0)) {
				sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println(sum);
		
		// for 문으로 작성
		sum = 0;
		for (i = 1; i <= 100; i++) {
			if ((i % 3 == 0 || i % 7 == 0) && (i % 21 != 0)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
