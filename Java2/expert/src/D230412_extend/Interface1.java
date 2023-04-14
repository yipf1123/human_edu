package extend;

public interface Interface1 {

		int a = 10;
		public static final double pi = 3.14;
		
		void test(int a); //{} 올 수 없음 - 구현을 여기서 안할꺼니까
		public abstract void test2(int a);
		
		default String search(String keyword){
			return null;
			}
}
