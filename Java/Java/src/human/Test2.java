package human;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		list.add("123");
		
		Vector<Integer> v = new Vector<>(5, 5);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);

		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
