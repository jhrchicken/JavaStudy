package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {

		// 길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장하기
		int[] arr1 = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번째 정수를 입력하세요 : ", i + 1);
			arr1[i] = scanner.nextInt();
		}

		// 첫번째 배열 출력하기
		System.out.println("순서대로 입력된 결과");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채우기
		int[] arr2 = new int[10];
		int start = 0;
		int end = 9;

		for (int i = 0; i < 10; i++) {
			if (arr1[i] % 2 == 0) {
				arr2[end--] = arr1[i];
			} else {
				arr2[start++] = arr1[i];
			}
		}

		// 두번째 배열 출력하기
		System.out.println("홀수 / 짝수 구분 입력 결과");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
