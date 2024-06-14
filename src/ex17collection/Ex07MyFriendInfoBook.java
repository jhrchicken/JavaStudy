package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Friend 클래스
class Friend {
	String name;
	String phone;
	String addr;

	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public void showAllData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + addr);
	}

	public void showBasicInfo() {

	}
}

// HighFriend 클래스
class HighFriend extends Friend {
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("== 고딩친구 (전체정보) ==");
		super.showAllData();
		System.out.println("별명 : " + nickname);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("== 고딩친구 ==");
		System.out.println("별명 : " + nickname);
		System.out.println("전화번호 : " + phone);
	}
}

// UnivFriend 클래스
class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData() {
		System.out.println("== 대딩친구 (전체정보) ==");
		super.showAllData();
		System.out.println("전공 : " + major);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("== 대딩친구 ==");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}
}

// FriendInfoHandler 클래스
class FriendInfoHandler {

	/*
	기존의 인스턴스 배열에 저장했던 것을 컬렉션으로 변경한다.
	컬렉션은 제네릭을 기반으로 하므로 인스턴스 생성 시 저장할 타입을 결정하게 된다.
	여기서는 Friend 클래스를 상속한 High, Univ를 저장할 것이므로 이와 같이 선언하면 된다.
	 */
	ArrayList<Friend> lists;

	public FriendInfoHandler() {
		// 생성자에서 정보를 저장할 List 컬렉션을 생성한다.
		lists = new ArrayList<Friend>();
	}

	public void addFriend(int choice) {
		Scanner scanner = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.println("이름 : ");
		iName = scanner.nextLine();
		System.out.println("전화번호 : ");
		iPhone = scanner.nextLine();
		System.out.println("주소 : ");
		iAddr = scanner.nextLine();

		/*
		List<E>는 자동인덱싱이 지원되므로 인스턴스 추가를 위해 index 변수를 별도로 사용할 필요가 없다.
		단지 add() 메서드를 통해 추가하면 된다.
		 */
		if (choice == 1) {
			System.out.println("별명 : ");
			iNickname = scanner.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);
		}
		if (choice == 2) {
			System.out.println("전공 : ");
			iMajor = scanner.nextLine();
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
	}

	public void showAllData() {
		// 일반 for문을 사용하는 경우 변수 i를 인덱스로 사용해야 하므로 get() 메서드를 통해 인스턴스를 인출한다.
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).showAllData();
		}
		System.out.println("== 전체정보가 출력되었습니다 ==");
	}

	public void showSimpleData() {
		/*
		확장 for문은 인덱스를 사용하지 않으므로 간단히 인스턴스를 인출할 수 있다.
		 */
		for (Friend list : lists) {
			list.showBasicInfo();
		}
		System.out.println("== 간략정보가 출력되었습니다 ==");
	}

	public void searchInfo() {

		boolean isFind = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요 : ");
		String searchName = scanner.nextLine();

		// 이터레이터 인스턴스 생성
		Iterator<Friend> itr = lists.iterator();
		while (itr.hasNext()) {
			// 저장된 인스턴스 인출
			Friend fr = itr.next();
			// 우리가 입력한 이름과 일치하는지 확인
			if (searchName.compareTo(fr.name) == 0) {
				// 일치하면 정보를 출력한다.
				fr.showAllData();
				System.out.println("** 귀하가 요청하는 정보를 찾았습니다 **");
				isFind = true;
			}
			if (isFind == false) {
				System.out.println("** 찾는 정보가 없습니다 **");
			}
		}

		// 퀴즈 1] 검색 기능의 searchInfo()를 일반 for문을 통해 기능을 구현하세요.
		for (int i = 0; i < lists.size(); i++) {
			if (searchName.compareTo(lists.get(i).name) == 0) {
				lists.get(i).showAllData();
				System.out.println("** 귀하가 요청하는 정보를 찾았습니다 **");
				isFind = true;
			}
			if (isFind == false) {
				System.out.println("** 찾는 정보가 없습니다 **");
			}
		}

	}

	public void deleteInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요 : ");
		String deleteName = scanner.nextLine();

		int deleteIndex = -1;
		// 확장 for문을 통해 반복하여 삭제할 이름을 검색한다.
		for (Friend fr : lists) {
			if (deleteName.compareTo(fr.name) == 0) {
				// 이름이 일치하면 삭제 처리한다.
				lists.remove(fr);
				deleteIndex = 1;
				break;
			}
		}
		if (deleteIndex == -1) {
			System.out.println("== 삭제된 데이터가 없습니다 ==");

		} else {
			System.out.println("== 데이터가 삭제되었습니다 ==");
		}

		// 퀴즈 2] 삭제 기능의 메서드 deleteInfo()를 이터레이터를 통해 기능을 구현하세요.
		Iterator<Friend> iterator = lists.iterator();
		while (iterator.hasNext()) {
			Friend fr = iterator.next();
			if (deleteName.compareTo(fr.name) == 0) {
				lists.remove(fr);
				deleteIndex = 1;
				break;
			}
		}
		if (deleteIndex == -1) {
			System.out.println("== 삭제된 데이터가 없습니다 ==");

		} else {
			System.out.println("== 데이터가 삭제되었습니다 ==");
		}
	}

}

public class Ex07MyFriendInfoBook {

	public static void menuShow() {
		System.out.println("### 메뉴를 입력하세요 ###");
		System.out.println("1. 고딩친구입력");
		System.out.println("2. 대딩친구입력");
		System.out.println("3. 전체정보출력");
		System.out.println("4. 간략정보출력");
		System.out.println("5. 검색");
		System.out.println("6. 삭제");
		System.out.println("7. 프로그램종료");
		System.out.println("메뉴선택 >>>");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler();

		while (true) {
			menuShow();

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				return;
			}

		}

	}

}
