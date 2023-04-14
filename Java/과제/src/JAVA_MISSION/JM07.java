package JAVA_MISSION;

import java.util.Scanner;

public class JM07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
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
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int key;
					key = arr[i];
					arr[i] = arr[j];
					arr[j] = key;
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
}
