package 과제;

import java.util.Scanner;
/*
 * 선택정렬
 * [오름차순]
 * 첫 번째 요소를 선택한다
 * 첫 번째 요소와 뒤의 나머지 요소들을 비교한다
 * 두 요소를 비교했을 때, 선택한 요소가 더 크면, 두 요소의 위치를 교환한다
 * 두번째 요소를 선택한다
 * ...
 * 마지막에서 2번째 요소를 선택할 때까지 반복한다
 * */
public class 선택정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int key;
					key = arr[i];
					arr[i] = arr[j];
					arr[j] = key;
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}


