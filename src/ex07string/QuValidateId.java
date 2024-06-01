package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {
		// 사용자로부터 아이디를 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String inputId = scanner.nextLine();

		// 아이디가 조건에 맞는지 확인하기
		if (idValidate(inputId) == true) {
			System.out.println("사용할 수 있는 아이디입니다.");
		} else {
			System.out.println("사용할 수 없습니다.");
		}
	}

	// idValidate() : 아이디가 조건에 맞는지 확인하는 메소드
	static boolean idValidate(String inputId) {
		boolean len, spelling;

		// 조건 1 : 아이디는 8~12자 사이로만 사용할 수 있다.
		if ((inputId.length() >= 8) && (inputId.length()) <= 12) {
			len = true;
		} else {
			len = false;
		}

		// 조건 2 : 영문과 숫자로만 입력할 수 있다.
		spelling = true;
		for (int i = 0; i < inputId.length(); i++) {
			char idChar = inputId.charAt(i);
			if (!(idChar >= 'a' && idChar <= 'z') && !(idChar >= '0' && idChar <= '9')) {
				spelling = false;
				break;
			}
		}

		// 위 조건에 모두 만족하면 true, 만족하지 않으면 false를 반환한다.
		return len && spelling;
	}

}
