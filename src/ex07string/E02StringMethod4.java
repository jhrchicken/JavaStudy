package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		// 시나리오 1
		getGenderByCharAt("190419-3000000");
		getGenderByCharAt("190419-4000000");

		// 시나리오 2
		EmailFormat("hong@daum.net");
		EmailFormat("not@naver");

		// 시나리오 3
		getGenderbyHyphen("190419-3000000");
		getGenderbyHyphen("190419-4000000");

		// 시나리오 4
		getFileExtension("my.file.images.jpg");

	}

	// 시나리오 1] 주민등록번호를 이용하여 성별을 판단하는 프로그램을 charAt()을 이용해서 작성하시오.
	static void getGenderByCharAt(String str) {
		char gender = str.charAt(7);

		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		} else if (gender == '5' || gender == '6') {
			System.out.println("외국인입니다.");
		} else {
			System.out.println("올바른 주민등록번호가 아닙니다.");
		}
	}

	// 시나리오 2] 해당 문자열이 이메일 형식인지 검사하는 프로그램을 contains()를 이용해서 작성하시오.
	static void EmailFormat(String str) {
		if (str.contains("@") && str.contains(".")) {
			System.out.println("이메일 형식입니다.");
		} else {
			System.out.println("이메일 형식이 아닙니다.");
		}
	}

	// 시나리오 3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()로 하이픈의 위치를 찾은 후 charAt()을 이용해서 작성하시오.
	static void getGenderbyHyphen(String str) {
		int idx = str.indexOf("-");
		char gender = str.charAt(idx + 1);

		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		} else if (gender == '5' || gender == '6') {
			System.out.println("외국인입니다.");
		} else {
			System.out.println("올바른 주민등록번호가 아닙니다.");
		}
	}

	// 시나리오 4] 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오.
	static void getFileExtension(String str) {
		int extenstion = str.lastIndexOf(".") + 1;
		System.out.println(str.substring(extenstion));
	}
}
