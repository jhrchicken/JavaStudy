package ex12inheritance;

// 자동차 클래스
class Car {
	int gasoline;
	// 생성자 : 가솔린을 초기화
	public Car(int gasoline) {
		this.gasoline = gasoline;
	}
}

// 자동차 클래스를 상속받은 하이브리드 자동차 클래스
class HybridCar extends Car {
	int electric;
	// 생성자 : 가솔린과 전기를 초기화
	public HybridCar(int gasoline, int electric) {
		super(gasoline);
		this.electric = electric;
	}
}
// 하이브리드 자동차 클래스를 상속받은 하이브리드 워터 자동차 클래스
class HybridWaterCar extends HybridCar {
	int water;
	// 생성자 : 가솔린과 전기와 물을 초기화
	public HybridWaterCar(int gasoline, int electric, int water) {
		super(gasoline, electric);
		this.water = water;
	}
	// 남은 가솔린량과 전기량과 워터량을 출력하는 메소드
	public void showNowGauge() {
		System.out.println("남은 가솔린 : " + gasoline);
		System.out.println("남은 전기량 : " + electric);
		System.out.println("남은 워터랑 : " + water);
	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10, 20, 30);
		hcar.showNowGauge();
	}

}
