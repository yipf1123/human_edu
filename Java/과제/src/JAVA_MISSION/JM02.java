package JAVA_MISSION;

import java.util.Scanner;

public class JM02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 1) {
				System.out.print(i);
				if (i != N) {
					System.out.print("+");
				}
				sum1 = sum1 + i;
			}
		}
		System.out.print("=" + sum1);

		System.out.println();
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
				if (i != N-1) {
					System.out.print("+");
				}
				sum2 = sum2 + i;
			}
		}
		
		// 어떤 정수를 나누어 떨어지게 하는 0이 아닌 정수
		System.out.print("=" + sum2);
		System.out.println();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}

	}
}
