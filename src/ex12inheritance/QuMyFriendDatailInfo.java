package ex12inheritance;

class MyFriendInfo {
	private String name;
	int age;

	public MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showMyFriendInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class MyFreindDetailInfo extends MyFriendInfo {
	private String addr;
	private String phone;

	public MyFreindDetailInfo(String name, int age, String addr, String phone) {
		super(name, age);
		this.addr = addr;
		this.phone = phone;
	}

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
