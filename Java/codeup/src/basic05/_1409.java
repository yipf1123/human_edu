package basic05;

import java.util.Scanner;

public class _1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr [i] = sc.nextInt();
		}
		
		int N = sc.nextInt();
		System.out.println(arr[N-1]);

		sc.close();
	}
}
