package expert;

public class Exam1 {
	
	public static void main(String[] args) {
		/*
		 * 1번.
			변수 두개에 3,4를 넣고
			출력결과 1 : "3 > 4의 결과는 false입니다"
			6,5로 바꾸고
			출력결과 2 : "6 > 5의 결과는 true입니다"
		 */
		
		int a = 3;
		int b = 4;
		System.out.println(a + ">" + b + "의 결과는 " + (a > b)+ "입니다.");
												// (a > b) 가로가 point!		
		a = 6;
		b = 5;
		System.out.println(a + ">" + b + "의 결과는 " + (a > b)+ "입니다.");
		
		/*
		* 2번. 주관식: 저장할 수 있는 변수의 타입을 적기
		  	2-1. 나는 자동차를 소유하고 있다 : 참/거짓 true/false : boolean
			2-2. 우리집에 있는 스마트폰의 개수 : 21억 이하의 정수 : int
			2-3. 내 이름 :String
			2-4. 1평은 3.3제곱미터입니다. 몇 제곱미터인지 저장할 변수 : double
		 */
		
		/*
		 * 1번.
			15와 20이 주어졌을때 세번째값이 그 사이에 있는지 확인
		 
		 	e는 15와 20 사이
		 	15 <= e <= 20
		 	15 <= e && e <= 20 
		 */
		
		// 15와 20은 포함하나요?
		// 실수도 포함되나요?
		
		int c = 15;
		int d = 20;
		int e = 17; //세번째 값
		
		if(15 <= e && e <= 20 ) {
			System.out.println("사이에 있습니다");
//		} else if(!(15 <= e && e <= 20 )) {
		} else if((15 > e || e > 20)) {	
			System.out.println("사이에 없습니다");			
		}
		/*
		 * 2번. 사각형의 한쪽 모서리 : x1:10, y1:20 
		  	사각형의 다른쪽 모서리: x2:90, y2:100 
		  	이 경우에 새로운 점 x3,y3가
		 	사각형 안에 들어가는가?
		 */
		
		int x1 = 10, y1 = 20, x2 = 90, y2 = 100;
		int x3 = 50, y3 = 50;
		
		if((x1 <= x3 && x3 <= x2) // x축 검사
			&& (y1 <= y3 && y3 <= y2)) { // y축 검사
			System.out.println("사각형에 포함됩니다.");			
		} else {
			System.out.println("사각형에 포함되지 않습니다.");
		}
	}
}






















