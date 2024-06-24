package ex20io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Friend 클래스
class Friend implements Serializable {
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

class FriendInfoHandler {

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
		for (Friend fr : lists) {
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

	// 프로그램 종료 시 친구의 정보를 직렬화한다.
	public void saveFriendInfo() {
		try {
			// 정보를 파일로 저장하기 위해 출력스트림 생성
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/myfriend_info.obj"));

			// List에 저장된 정보의 개수만큼 반복
			for (Friend fr : lists) {
				/*
				List에 저장된 Friend 인스턴스를 순서대로 꺼내서 파일에 저장한다. 즉 직렬화한다.
				 */
				out.writeObject(fr);
			}
			out.close();
		} catch (IOException e) {
			System.out.println("직렬화 중 예외발생");
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
	}

	// 프로그램이 시작되면 저장된 파일을 통해 복원한 후 컬렉션에 추가한다.
	public void readFriendInfo() {
		try {
			// 파일을 복원(역직렬화)하기 위해 스트림을 생성한다.
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/myfriend_info.obj"));

			/*
			파일에 친구의 정보가 몇 개 저장되었는지 확인할 수 없으므로 무한루프로 구성한다.
			 */
			while (true) {
				/*
				직렬화될 때 Object 기반으로 저장되므로 반드시 다운캐스팅 해야한다.
				 */
				Friend fr = (Friend) in.readObject();
				// List에 추가한다.
				lists.add(fr);
				fr.showAllData();
				// 만약 더 이상 복원할 인스턴스가 없으면 예외가 발생한다.
			}
		}
		/*
		예외가 발생하면 catch절로 예외인스턴스가 던져지므로 while루프를 탈출할 수 있다.
		 */
		catch (ClassNotFoundException e) {
			System.out.println("클래스가 없음");
		} catch (IOException e) {
			System.out.println("역직렬화 중 예외발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		System.out.println("친구 정보가 저장되었습니다.");

	}

}

public class E12MyFriendSerializable {

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

		/*
		프로그램을 시작하면 obj 파일에 있는 내용을 복원(역직렬화)해서 List에 추가한다.
		 */
		handler.readFriendInfo();

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
				/*
				프로그램을 종료하면 List에 저장된 모든 인스턴스(연락처)가 파일로 직렬화된다.
				 */
				handler.saveFriendInfo();
				return;
			}

		}

	}

}
