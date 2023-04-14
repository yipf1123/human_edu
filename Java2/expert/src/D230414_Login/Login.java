package D230414_Login;

public class Login {

	/*
	 * 필드 : 1단계 id = "human", pw = "1234" 2단계 배열로 여러개 계정 관리
	 */
	private String id = "human";
	private String pw = "1234";

	// "메인 페이지 입니다." 출력만
	private void goMain(String id) {
		System.out.println("메인 페이지 입니다.");
		System.out.println(id + "님 환영합니다.");
	}

	// 전달받은 계정(Login_Test 클래스)과 저장되어있는 계정(Login 클래스)과
	// 일치하는게 있는지 판단해서
	// 결과를 돌려줌
	private boolean loginCheck(String id, String pw) {
		// Login_Test에 있는 id와 pw임

		// if 합치기 어려운 경우
		// 하나씩 만들어서 나중에 합치기
		// 아이디 비교
		// this.id = Login 클래스의 id
		if (this.id.equals(id)) {
			System.out.println("아이디는 일치함");
		}

		if (this.pw.equals(id)) {
			System.out.println("비밀번호는 일치함");
		}

		boolean result = false;
		// 현재에는 별쓸모가 없지만 
		// try-catch문에서 이상이 생겼을때 잡기위해 보통 false로 잡음
		// 만약 true로 잡으면 이상이 생길수 있기 때문에 

		if ((this.id.equals(id)) && (this.pw.equals(pw))) {
			System.out.println("아이디와 비밀번호가 모두 일치함");
			result = true;
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않음");
			result = false;
		}
		System.out.println("점검 결과 : result : " + result);
		return result;
	}

	// 메소드 loginCheck를 호출해서
	// 결과에 따라
	// 참이면 goMain실행
	// 거짓이면 "계정이 없습니다"
	public void doLogin(String id, String pw) {
		boolean result = loginCheck(id, pw);
		if (result == true) {
			goMain(id);
		} else {
			System.out.println("계정이 없습니다");
		}
	}
}// class 꺼임
