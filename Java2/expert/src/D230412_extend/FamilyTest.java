package extend;

public class FamilyTest {
	
		public static void main(String[] args) {
			
			Child child = new Child(4); // Child 생성자를 불러옴
			child.say();
			child.hi();
			
			Parent p = (Parent) child;
			p.say();
			// p.hi();
			
//			hello(p);
			hello(child);
		}
		
		static void hello(Parent par) {
			par.say();
		}
}
