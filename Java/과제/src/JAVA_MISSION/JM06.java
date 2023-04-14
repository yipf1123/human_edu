package JAVA_MISSION;

import java.util.Arrays;
import java.util.Scanner;


public class JM06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");
			int[] lotto = new int[6];

			// 중복제거
			for (int j = 0; j < 6; j++) {
				int random = (int) (Math.random() * 45 + 1);
				lotto[j] = random;
				
//				for (int k = 0; k < lotto.length; k++) {
//					if( i == k) continue;
//					if(random == lotto[j]) {
//						j--;
//						break;
//					}
//				}
				
				for (int k = j - 1; k >= 0; k--) {
					if (lotto[k] == lotto[j]) {
						j--;
						break;
					}
				}
				
			} 
			
			// 정렬
			Arrays.sort(lotto);
//			for (int x = 0; x < lotto.length; x++) {
//				for (int y = x + 1; y < lotto.length; y++) {
//					if(lotto[x] > lotto[y]) {
//						int key;
//						key = lotto[x];
//						lotto[x] = lotto[y];
//						lotto[y] = key;
//					}
//				}
//				
//			}
			
			
			// 출력
			for (int h = 0; h < lotto.length; h++) {
				System.out.print(lotto[h] + " ");
				
			}
			System.out.println();
		}
	}

}