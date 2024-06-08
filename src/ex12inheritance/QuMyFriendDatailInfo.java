package ex12inheritance;

// 친구의 기본정보를 저장할 클래스
class MyFriendInfo {
	private String name;
	int age;

	// 생성자 : 이름과 나이를 초기화
	public MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 이름과 나이 정보를 출력하는 메소드
	public void showMyFriendInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

// 친구의 기본정보 클래스를 상속받아 상세정보를 저장할 클래스
class MyFreindDetailInfo extends MyFriendInfo {
	private String addr;
	private String phone;

	// 생성자 : 이름과 나이와 주소 그리고 전화번호를 초기화
	public MyFreindDetailInfo(String name, int age, String addr, String phone) {
		super(name, age);
		this.addr = addr;
		this.phone = phone;
	}

	// 이름과 나이와 주소 그리고 전화번호 정보를 출력하는 메소드
	public void showMyFriendDatailInfo() {
		showMyFriendInfo();
		System.out.println("주소 : " + addr);
		System.out.println("전화 : " + phone);
	}
}

public class QuMyFriendDatailInfo {

	public static void main(String[] args) {
		MyFreindDetailInfo friend = new MyFreindDetailInfo("이순신", 100, "성균관", "010-1000-8888");
		friend.showMyFriendDatailInfo();
	}

}
