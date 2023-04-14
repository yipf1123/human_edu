package basic03;

import java.util.Scanner;

public class _1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		double arr[] = new double[8];
		arr[0] = a + b ;
		arr[1] = a - b;
		arr[2] = a / b;
		arr[3] = a * b;
		arr[4] = Math.pow(a,b);
		arr[5] = b - a;
		arr[6] = b / a;
		arr[7] = Math.pow(b,a);
		
		double max = Integer.MIN_VALUE; // int 타입의 최댓값 : 21억 xxx
		for (int i = 0; i < 8; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.printf("%.6f", max);
		sc.close();
	}

}
