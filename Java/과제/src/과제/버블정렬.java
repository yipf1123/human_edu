package 과제;

import java.util.Scanner;

/*
 * 버블정렬
 * [오름차순]
 * 첫번째와 두번째 이웃한 요소를 비교한다
 * 앞선 요소가 더 크면 교환한다
 * 두번째와 세번째 이웃한 요소를 비교한다
 * 앞선 요소가 더 크면 교환한다
 * ...
 * 요소의 개수 -1회 반복한다
 */


public class 버블정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j <= N-2-i; j++) {
				if (arr[j] > arr[j+1]) {
					int key;
					key = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = key;
				}
			}	
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	
}
