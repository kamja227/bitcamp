package com.bit.day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex03 {
	// Set
	public static void main(String[] args) {
//		java.util.TreeSet set01 = new TreeSet(); // 같은 동작
		java.util.HashSet set01 = new HashSet();
		
		set01.add("첫번째");
		set01.add("두번째");
		set01.add("세번째");
		set01.add("네번째"); // 인덱스번호는 순서 but Set타입은 순서가 없음
//		set01.add("두번째"); // 중복 안됨
		set01.add("다섯번째");
		
		System.out.println(set01.size());
		
		// 1번 방식 - 권장
		java.util.Iterator ite = set01.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("---------------------------");
		
		// 2번 방식
		Iterator ite2 = set01.iterator();
		for(int i=0; i<set01.size(); i++) {
			System.out.println(ite2.next()); // ite로 호출하면 이미 끝나서 exception발생
		}
		
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());

		
	
	}
}
