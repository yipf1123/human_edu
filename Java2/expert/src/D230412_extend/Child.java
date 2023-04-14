package extend;

public class Child extends Parent {

	// Child 생성자
	Child(int a) {
		// 부모 생정자 호출
		super(); // 항상 맨 위에 있어야 함
		System.out.println("Child 생성자");
	}

	void hi(){
		System.out.println("hi");
		super.say();
	}

	@Override //부모꺼와 동일한지 확인해 주는 기능 
	public void say() {
		System.out.println("Child - 네?");
	}
}
