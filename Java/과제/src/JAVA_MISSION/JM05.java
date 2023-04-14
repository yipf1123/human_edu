package JAVA_MISSION;

import java.util.Scanner;

public class JM05 {

	public static void printMenu() {
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.print("********** 번호 :");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo;
		int count = 0;
		String menuName = "";

		do {
			printMenu();
			menuNo = sc.nextInt();

			switch (menuNo) {
			case 1:
				menuName = "황금올리브 반반한 치킨";
				break;
			case 2:
				menuName = "뿌잉클 치킨";
				break;
			case 3:
				menuName = "처갓집에서 호식이가 만든 치킨";
				break;

			}

			if (menuNo > 0 && menuNo <= 3) {
				System.out.println("'" + menuName + "'이(/가) 주문되었습니다.\n");
				count++;
			} else if (menuNo == 0) {
				System.out.println("총 " + count + " 개의 상품이 주문되었습니다.\n");
				break;
			} else {
				System.out.println("0~3번 사이의 정수를 입력해주세요.\n");
			}
		} while (true);

	}// main

}// class
