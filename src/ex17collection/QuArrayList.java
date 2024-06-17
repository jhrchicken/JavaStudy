package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

// Student 클래스
class Student {
	// 멤버변수
	private String name;
	private int age;
	private String year;

	// 생성자
	public Student(String name, int age, String year) {
		this.name = name;
		this.age = age;
		this.year = year;
	}

	// 오버라이딩 : 이름을 기준으로 같고 다름을 판단한다.
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if ((this.name).equals(student.name)) {
			System.out.println("오버라이딩 한 equals()가 호출되었습니다 : " + student.name);
			return true;
		} else {
			return false;
		}
	}

	// 오버라이딩 : 다음과 같은 형식으로 출력한다.
	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d, 학번:%s", name, age, year);
	}
}

public class QuArrayList {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();

		// 저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");

		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);

		// 1. 검색할 이름을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String inputName = scanner.nextLine();

		// 2. 검색결과 유/무에 따라
		int index = list.indexOf(new Student(inputName, 0, null));

		// .. 검색결과 없을 때 검색결과가 없다고 출력한다.
		if (index == -1) {
			System.out.println("[검색결과가 없습니다]");
		}
		// .. 검색결과가 있을 때 검색된 데이터를 삭제한다.
		else {
			System.out.println("[검색되었습니다]");
			list.remove(index);
		}

		// 3. 확장 for문으로 컬렉션 전체를 접근하여 전체정보 출력
		System.out.println("삭제 후 정보출력");
		for (Student st : list) {
			System.out.println(st);
		}

	}

}
