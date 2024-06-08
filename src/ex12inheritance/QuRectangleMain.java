package ex12inheritance;

class Rectangle {
	private int width;
	private int height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void showAreaInfo() {
		System.out.println("직사각형 면적 : " + (width * height));
	}
}

class Square extends Rectangle {
	private int width;

	public Square(int width) {
		super(width, width);
		this.width = width;
	}

	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적 : " + (width * width));
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
