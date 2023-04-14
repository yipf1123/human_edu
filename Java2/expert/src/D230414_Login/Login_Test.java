package D230414_Login;

public class Login_Test {
	
	//필드
	static String id = "enshu";
	static String pw = "es1234";
	
	public static void main(String[] args) {
		
		/*
		 * 내가 가지고 있는
		 * id, password를 Login 클래스에 전달하고
		 * 결과를 확인
		 */
		Login login =  new Login();
		
		login.doLogin(id, pw);
		
	}
}
