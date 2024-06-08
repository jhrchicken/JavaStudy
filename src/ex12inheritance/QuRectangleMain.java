package ex12inheritance;

// 직사각형을 표현한 클래스
class Rectangle {
	private int width;
	private int height;

	// 생성자 : 너비와 높이를 초기화
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 직사각형의 너비를 반환하는 메소드
	public int getWidth() {
		return width;
	}

	// 직사각형의 넓이를 계산하여 출력하는 메소드
	public void showAreaInfo() {
		System.out.println("직사각형 면적 : " + (width * height));
	}
}

// 직사각형 클래스를 상속받아 정사각형을 표현한 클래스
class Square extends Rectangle {
	// 생성자 : 너비로 너비와 높이를 초기화
	public Square(int width) {
		super(width, width);
	}

	// 오버라이딩 : 정사각형의 넓이를 계산하여 출력하는 메소드
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적 : " + (getWidth() * getWidth()));
	}
}

public class QuRectangleMain {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 3);
		rec.showAreaInfo();

		Square sqr = new Square(7);
		sqr.showAreaInfo();
	}

}
