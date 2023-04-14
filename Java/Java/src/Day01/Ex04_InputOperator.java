package Day01;

import java.util.Scanner;

public class Ex04_InputOperator {

	public static void main(String[] args) {
		// 기본 입력 객체 Scanner 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		int avg = sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg는 int(정수)형 변수라서 소수부분을 표현할 수 없다.
		// 평균을 구한 소수점까지 표현하려면 실수현 변수를 사용해야한다.
		
		sc.close();
	}
}
