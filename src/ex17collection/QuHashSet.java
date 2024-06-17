package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

// Avengers 클래스
class Avengers {
	// 멤버변수
	String name;
	String heroName;
	String weapon;

	// 생성자
	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	// 오버라이딩 : 이름과 히어로네임과 무기가 같으면 같은 해시코드를 반환한다.
	@Override
	public int hashCode() {
		return Objects.hash(name, heroName, weapon);
	}

	// 오버라이딩 : 이름과 히어로네임과 무기를 기준으로 같고 다름을 판단한다.
	@Override
	public boolean equals(Object obj) {
		Avengers av = (Avengers) obj;
		if (name.equals(av.name) && heroName.equals(av.heroName) && weapon.equals(av.weapon)) {
			return true;
		} else {
			return false;
		}
	}

	// 오버라이딩 : 다음과 같은 형식으로 출력한다.
	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", 능력=" + weapon + "]";
	}
}

public class QuHashSet {

	public static void main(String[] args) {
		HashSet<Avengers> set = new HashSet<Avengers>();

		// 저장할 객체 생성
		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");

		// 컬렉션에 객체 추가
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);

		// 최초 전체 정보를 출력한다.
		System.out.println("[최초 전체 정보출력]");
		for (Avengers av : set) {
			System.out.println(av.toString());
		}

		// 검색할 이름을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scanner.nextLine();

		// 검색결과 유무를 확인하여 ..
		boolean isSearch = false;
		Iterator<Avengers> itr = set.iterator();
		while (itr.hasNext()) {
			Avengers av = itr.next();
			// 검색결과가 있으면 정보를 출력하고 ..
			if (searchName.compareTo(av.name) == 0) {
				System.out.println(av);
				System.out.println("요청하신 정보를 찾았습니다.");
				isSearch = true;
			}
		}
		// 검색결과가 없으면 검색결과가 없다고출력한다.
		if (isSearch == false) {
			System.out.println("해당 영웅은 없습니다.");
		}

	}

}
