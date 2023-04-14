package Day04;

import java.util.Scanner;

/*
 ########## 메 뉴 판 ##########
 1. BHC 	- 뿌링클치킨
 2. BBQ		- 황금올리브 반반치킨
 3. 노랑통닭	- 후라이드 치킨
 4. KFC		- 핫크리스피 치킨
 5. 치킨나라	- 양념치킨
 0. 종료 
 ########## 입력 : 

 메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
 "(해당메뉴) 가 주문되었습니다." 라고 출력하시오.
 0 을 입력하기 전까지 반복하고,
 0 을 입력하면 반복을 종료합니다.
 종료 시, "?개의 주문을 완료하였습니다." 라고 출력하시오.
 */
public class Ex05_ChickenMenu {
	
	// 메소드 : 코드의 모음
	// - 메소드 정의
	// 접근지정자 (static) 반환타입 메소드명 (매개변수1, 매개변수2) { 실행문; }
	// * void - 반환할 값이 없음을 알려주는 키워드
	// 메뉴판 출력
	public static void printMenu() {
		// 메뉴판
		// 들여쓰기 : tab
		// 내어쓰기 : shift + tab
		// 코드정리 : ctrl + shift + F
		System.out.println("########## 메 뉴 판 ##########");
		System.out.println("1. BHC 		- 뿌링클치킨");
		System.out.println("2. BBQ		- 황금올리브 반반치킨");
		System.out.println("3. 노랑통닭	- 후라이드 치킨");
		System.out.println("4. KFC		- 핫크리스피 치킨");
		System.out.println("5. 치킨나라	- 양념치킨");
		System.out.println("0. 종료 ");
		System.out.print("########## 입력 : ");
	}

	public static void main(String[] args) {
		// 변수 선언
		int menuNo = 0;				// 메뉴번호
		String menuName = "";		// 메뉴이름
		int count = 0;				// 주문개수
		
		Scanner sc = new Scanner(System.in);
		
		do {
			// -메소드 호출
			// 메소드명( 인자1, 인자2 );
			// 메뉴판 출력
			printMenu();
			// 메뉴번호 입력
			menuNo = sc.nextInt();
			// 종료 조건
			if (menuNo == 0)
				break;
			// 메뉴 선택
			switch (menuNo) {
			case 1:
				menuName = "뿌링클치킨";
				break;
			case 2:
				menuName = "황금올리브 반반치킨";
				break;
			case 3:
				menuName = "후라이드 치킨";
				break;
			case 4:
				menuName = "핫크리스피 치킨";
				break;
			case 5:
				menuName = "양념치킨";
				break;
			default:
				menuName = "(선택안함)";
				break;
			}
			// 유효성 검사
			// - 메뉴번호는 0번~5번까지만 가능
			if (menuNo >= 0 && menuNo <= 5) {
				// 주문 출력
				System.out.println(menuName + "이 주문되었습니다.\n");
				count++;
			} else {
				System.out.println("0~5번 사이의 정수를 입력해주세요.\n");
			}
		} while (true);
		
		System.out.println(count + " 개의 주문을 완료하였습니다.");
		
	}



}

