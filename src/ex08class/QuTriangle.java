package ex08class;

// 삼각형 클래스
class Triangle {
	private double bottom, height;

	// 밑변과 높이를 초기화하는 메소드
	public void init(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}

	// 밑변을 설정하는 메소드
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	// 높이를 설정하는 메소드
	public void setHeight(double height) {
		this.height = height;
	}

	// 넓이를 계산하여 반환하는 메소드
	public double getArea() {
		return bottom * height * 0.5;
	}

}

public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();

		t.init(10, 17);
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);
		t.setHeight(14);
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}
}
