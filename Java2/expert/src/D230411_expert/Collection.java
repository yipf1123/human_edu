package expert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		
		
//		ArrayList list = new ArrayList();
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int a = (Integer)list.get(0); // object 형태로 꺼내기 때문에 타입을 써준다.
		int b =			 list.get(1);
		
		System.out.println("list.size(): " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "=" + list.get(i));
			
		}	
	
		HashMap<String, String>map = new HashMap<String, String>(); // <> 꺼내기 쉽게, 검사하기 위해
		map.put("key1", "value1");
		
		String v1 = (String)map.get("key1");
		String v2 =         map.get("key2");
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		
	
	}

}

