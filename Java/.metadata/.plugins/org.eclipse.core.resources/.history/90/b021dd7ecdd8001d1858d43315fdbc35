package com.instagram;

public class FeedTest {

	public static void main(String[] args) {
		
		
		String id = "enshu1123";
		String[] imgs = new String[2];
		imgs[0] = "1.jpg";
		imgs[1] = "2.jpg";
		
		Feed feed = new Feed(id, imgs);
		
		
		String id2 = feed.id;
		feed.type = "일반글";
		System.out.println(feed.type);
		System.out.println("id2 : " + id2);
		
		
		Feed feed2 = new Feed("jhes",new String[]{"a.jpg"});
		
		System.out.println(feed2.type);
		System.out.println("feed2 id : " + feed2.id);
	
		// 필드를 직접 변경 후 출력
		feed2.id = "idid";
		System.out.println("feed2 id : " + feed2.id);
		
		// feed2의 hit 관리
		// 필드는 private으로 막고 getter와 setter를 이용
		// setter에서 음수는 반영하지 않도록 제어
		feed2.setHit(-1);
		System.out.println("feed2 hit : " + feed2.getHit());
		
		feed2.setHit(3);
		long hit = feed2.getHit();
		System.out.println("feed2 hit : " + feed2.getHit());
		
		
		// 요구사항분석
		// 설계
		// 개발
		// 테스트
		// 개발
		// 테스트
		
	}

}
