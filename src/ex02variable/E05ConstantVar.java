package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {
		
		/*
		상수 : 저장된 값이 변하지 않는 메모리의 한 종류로 선언할 떄 앞부분에 final을 붙여준다.
		- 상수는 한번만 초기화되고, 이후에는 값을 변경할 수 없다.
		- 선언시 전체를 대문자로 기술한다. 만약 연결할 단어가 있다면 가독성을 위해 '언더바(언더스코어)'를 사용한다.
		- 주로 프로그램에서 코드의 가독성을 높여주는 역할을 한다.
		 */
		// 상수 선언과 동시에 초기화
		final double PI = 3.14;
		System.out.println("PI(원주율) = " + PI);
		
		// 에러 발생. 상수는 한번 초기화하면 변결할 수 없다.
		// PI = 3.141592;
		
		// 상수는 선언과 초기화를 분리할 수 있다.
		final String NICK_NAME;
		// 하지만 초기화가 안된 상태에서는 사용할 수 없어 에라가 발생한다.
		// System.out.println("우리는 " + NICK_NAME);
		// 반드시 초기화 이후 사용해야 한다.
		NICK_NAME = "개발자";
		System.out.println("우리는 " + NICK_NAME);
		
		/*
		가위, 바위, 보 게임 제작을 위해 개발자가 1, 2, 3 으로 정한 후 진행한다고 가정하면 ...
		 */
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		int computer, user;
		
		/*
		1과 3은 개발자 본인만 알 수 있는 내용이므로 가독성이 떨어진다.
		코드를 분석하는 절차가 필요하다.
		 */
		computer = 1;
		user = 3;
		System.out.println("컴퓨터가 이겼습니다.");
		
		/*
		PAPER 와 같은 단어는 누가 보더라도 이해할 수 있으므로 가독성이 높은 명시적인 코드라 할 수 있다.
		*/
		computer = SCISSOR;
		user = PAPER;
		System.out.println("컴퓨터가 이겼습니다.");
	}

}
