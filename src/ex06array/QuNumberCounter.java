package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		// answer 배열의 데이터를 읽어서 각 정수의 개수를 카운트하여 counter 배열에 저장하기
		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}

		// counter 배열의 데이터를 읽어서 출력하기
		for (int i = 0; i < 4; i++) {
			System.out.printf("counter[%d] => %d%n", i, counter[i]);
		}
	}

}
