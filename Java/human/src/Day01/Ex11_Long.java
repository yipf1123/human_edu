package Day01;

public class Ex11_Long {

	public static void main(String[] args) {
		// int (4byte : 32 bits) :  2^32 개  : 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		// int intMax = 2200000000;
	
		// long (8byte : 64bits) : 2^64 개 
	   long ln1 =1000;           // (long) = (int)
	   long ln2 =2100000000;     // (long) = (int)
	   // long 타입 리터럴 : 숫자L 
	   long ln3 =2200000000L;
	   
	   int max = Integer.MAX_VALUE;     // int 형의 최댓값 (21억xx)
	   int min = Integer.MIN_VALUE;     // int 형의 최솟값 (-21억xx)
	   
		System.out.println("int의 최댓값 : " + max);
		System.out.println("int의 최솟값 : " + min);
	
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
		
	}
}
