package 과제;

import java.util.Scanner;

public class 삽입정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				int key= arr[i]; 
				if (arr[j] > key) {
					arr[i] = arr[j];
					arr[j] = key;
					i--;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
