package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

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

class FriendInfoHandler {
	private Friend[] myFriends;
	private int numOfFriends;

	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
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

		if (choice == 1) {
			System.out.println("별명 : ");
			iNickname = scanner.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		if (choice == 2) {
			System.out.println("전공 : ");
			iMajor = scanner.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
	}

	public void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("== 전체정보가 출력되었습니다 ==");
	}

	public void showSimpleData() {

		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("== 간략정보가 출력되었습니다 ==");
	}

	public void searchInfo() {
		boolean isFind = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요 : ");
		String searchName = scanner.nextLine();

		for (int i = 0; i < numOfFriends; i++) {
			if (searchName.compareTo(myFriends[i].name) == 0) {
				myFriends[i].showAllData();
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

		for (int i = 0; i < numOfFriends; i++) {
			if (deleteName.compareTo(myFriends[i].name) == 0) {
				myFriends[i] = null;
				deleteIndex = i;
				numOfFriends--;
				break;
			}
		}

		if (deleteIndex == -1) {
			System.out.println("== 삭제된 데이터가 없습니다 ==");

		} else {
			for (int i = deleteIndex; i < numOfFriends; i++) {
				myFriends[i] = myFriends[i + 1];
			}
			System.out.println("== 데이터 (" + deleteIndex + "번) 가 삭제되었습니다 ==");
		}
	}

}

public class QuMyFriendInfoBook {

	public static void menuShow() {
		System.out.println("### 메뉴를 입력하세요 ###");
		System.out.println("1. 고딩친구입력");
		System.out.println("2. 대딩친구입력");
		System.out.println("3. 전체정보출력");
		System.out.println("4. 간략정보출력");
		System.out.println("5. 검색");
		System.out.println("6. 삭제");
		System.out.println("7. 프로그램종료");
		System.out.print("메뉴선택 >>>");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler(100);

		while (true) {
			menuShow();

			/*
			문자가 입력된 이후에도 '7'을 입력하여 프로그램을 종료하기 전까지 프로그램은 동작해야 하므로
			우선 String으로 입력을 받고, 그 이후 정수형으로 변환하는 과정(예외발생)을 거친다.
			 */
			String strChoice = scanner.nextLine();

			// 아래 문장에서 예외가 발생하므로 try문으로 묶는다.
			try {
				int choice = Integer.parseInt(strChoice); // 예외발생

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
			// InputMismatchException으로 잘못된 입력에 대한 예외를 처리한다.
			catch (InputMismatchException e) {
				System.out.println("메뉴는 숫자를 입력해야 합니다.");
				// e.printStackTrace();
			}
			// 이 외의 예외는 Exception으로 처리한다.
			catch (Exception e) {
				System.out.println("알 수 없는 오류가 발생했습니다.");
				// e.printStackTrace();
			}

		}

	}

}
