package ex12inheritance;

// 포인트 클래스
class Point {
	int xDot, yDot;

	// 생성자 : x좌표와 y좌표를 초기화
	public Point(int x, int y) {
		xDot = x;
		yDot = y;
	}

	// x좌표와 y좌표를 출력하는 메소드
	public void showPointInfo() {
		System.out.println("[x좌표:" + xDot + ", y좌표:" + yDot + "]");
	}
}

// 원 클래스
class Circle {
	int radian;
	Point center;

	// 생성자 : 포인트 클래스와 반지름을 초기화
	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		radian = r;
	}

	// x좌표와 y좌표 그리고 반지름을 출력하는 메소드
	public void showPointInfo() {
		System.out.println("반지름 : " + radian);
		center.showPointInfo();
	}
}

// 링 클래스
class Ring {
	Circle innerCircle;
	Circle outerCircle;

	// 생성자 : 내부 원와 외부 원을 초기화
	public Ring(int x1, int y1, int r1, int x2, int y2, int r2) {
		innerCircle = new Circle(x1, y1, r1);
		outerCircle = new Circle(x2, y2, r2);
	}

	// 안쪽 원의 x좌표, y좌표, 반지름 정보와 바깥 원의 x좌표, y좌표, 반지름 정보를 출력하는 메소드
	public void showRingInfo() {
		System.out.println("안쪽원의 정보 : ");
		innerCircle.showPointInfo();
		System.out.println("바깥쪽원의 정보 : ");
		outerCircle.showPointInfo();
	}

}

public class QuRingMake {

	public static void main(String[] args) {
		Ring c = new Ring(1, 1, 3, 2, 2, 9);
		c.showRingInfo();
	}

}
