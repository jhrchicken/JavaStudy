package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		// 1. 크기가 10인 정수타입의 배열을 선언한다.
		int[] arr = new int[10];

		// 2. 반복문을 이용하여 배열을 채운다.
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}

		// 3. 2번에서 채운 배열을 출력한다.
		System.out.println("초기화 된 배열 요소");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

		// 4. 위에서 채운 배열의 첫번째 값에서 마지막 값까지 누적해서 더한다.
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += arr[i];
		}

		// 5. 누적해서 더한 값을 출력한다.
		System.out.println("배열 전체 요소의 합 : " + sum);

	}

}
