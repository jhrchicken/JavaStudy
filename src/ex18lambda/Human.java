package ex18lambda;

public class Human {

	// 멤버변수 : 이름, 성별, 점수
	private String name;
	private String gender;
	private int score;

	// 인자생성자
	public Human(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	// getter와 setter 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
