package ex08class;

// 구슬치기 하는 아이들을 추상화한 메소드
class ChildProperty {
	int marble;

	// 생성자 : 구슬의 보유개수를 초기화
	public ChildProperty(int marble) {
		this.marble = marble;
	}

	// 구슬의 보유개수를 출력하는 매소드
	public void showProperty() {
		System.out.println(this.marble);
	}

	// 구슬을 획득 또는 상실하는 것을 표현하는 메소드
	public void obtainBead(ChildProperty child, int num) {
		this.marble += num;
		child.marble -= num;
	}
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();

		child1.obtainBead(child2, 5);
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();

	}

}
