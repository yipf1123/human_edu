package JAVA_MISSION;


public class JM03 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			// i = 1~100
			
			int ten = i / 10;		// 십의자리
			int one = i % 10;		// 일의자리
			
			//십의 자리가 369 인지 여부
			boolean isTen369 = ten == 3 || ten == 6 || ten == 9;
			//일의 자리가 369 인지 여부
			boolean isOne369 = ten == 3 || ten == 6 || ten == 9;
			
//	boolean isTen369 = (ten != 0) && (ten % 3 == 0);			
//	boolean isOne369 = (one != 0) && (one % 3 == 0);	
			
			// 십의 자리, 일의 자리 둘다 369 이면,
			 if( isTen369 && isOne369) System.out.println("**");
			 // 십의 자리, 일의 자리 둘 중 하나라도 369이면, *
			 else if( isTen369 || isOne369) System.out.println("*");
			 else System.out.println(i);
			
			
		}
		
		
	}
	
	
	
}
