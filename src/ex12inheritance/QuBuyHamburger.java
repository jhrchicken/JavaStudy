package ex12inheritance;

// 버거 클래스
class Burger {
	private String name;
	private int price;
	private String patty;
	private String sauce;
	private String vegetable;

	// 생성자 : 버거의 이름, 가격, 패티, 소스, 야채를 초기화
	public Burger(String name, int price, String patty, String sauce, String vegetable) {
		this.name = name;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}

	// 가격을 반환하는 메소드
	public int getPrice() {
		return price;
	}

	// 버거의 이름, 가격, 패티, 소스, 야채 정보를 출력하는 메소드
	public void showPrice() {
		System.out.println(name);
		System.out.println("가격 : " + price);
		System.out.printf("식재료 : %s, %s, %s%n", patty, sauce, vegetable);
	}
}

// 버거 기본 가격 클래스
class HamburgerPrice {
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	// 생성자 : 버거 클래스를 초기화
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}

	// 기본 가격을 계산하는 메소드
	public int calcPrice() {
		return burger.getPrice() + COKE + POTATO;
	}

	// 버거 정보와 기본 가격을 출력하는 메소드
	public void showPrice() {
		burger.showPrice();
		System.out.println("결재금액 : " + calcPrice());
		System.out.println("==================================");
	}
}

// 버거 기본 가격 클래스를 상속한 세트 가격 클래스
class SetPrice extends HamburgerPrice {
	// 생성자 : 버거 클래스를 초기화
	public SetPrice(Burger burger) {
		super(burger);
	}

	// 오버라이딩 : 세트 가격을 계산하는 메소드
	@Override
	public int calcPrice() {
		return super.calcPrice() - 500;
	}

	// 오버라이딩 : 버거 정보와 세트 가격을 출력하는 메소드
	@Override
	public void showPrice() {
		burger.showPrice();
		System.out.println("세트결제금액 : " + calcPrice());
		System.out.println("==================================");
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		// 치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		// 치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");

		// 치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1);
		price1.showPrice(); // 4500원

		// 치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2);
		price2.showPrice(); // 5000원

	}

}
