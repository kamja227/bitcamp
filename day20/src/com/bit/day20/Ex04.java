package com.bit.day20;

import java.util.HashSet;
import java.util.Iterator;

class MyCar {
	int su;
	MyCar(int a) {su = a;}
	
	public int compareTo(Object obj) {
		return su - ((MyCar)obj).su;
	}
}

public class Ex04 {
	
	public static void main(String[] args) {
		java.util.Set set1 = new java.util.HashSet(); // 순서없음
//		java.util.Set set1 = new java.util.TreeSet(); // 순서대로 // 작으면 위로 올라가서 자동으로 규칙 생김(숫자일때만) //유니코드로 크기비교
														// 객체를 호출할 때는 오류
//		set1.add("a");
//		set1.add("ab");
//		set1.add("accd");
//		set1.add("abcde");

		set1.add(new MyCar(1)); //TreeSet 오류
		set1.add(new MyCar(2));
		set1.add(new MyCar(3));
		set1.add(new MyCar(4));
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			MyCar car = (MyCar)ite.next();
			System.out.println(ite.next());
		}
	}
}
