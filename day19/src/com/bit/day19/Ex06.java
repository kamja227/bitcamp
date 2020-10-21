package com.bit.day19;

import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		// Queue  - 선입선출
		
		java.util.Queue list = new LinkedList(); // Queue에 선언된 것들만 LinkedList에서 쓸 수 있음
		list.offer("첫번째"); // list.add()
		list.offer("두번째");
		list.offer("세번째");
		list.offer("네번째");
		
		for(int i=0; i<4; i++) {
			String msg = (String)list.peek(); // peek() - 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함. 만약 큐가 비어있으면 null을 반환함.
			System.out.println(msg);
			System.out.println(list.poll()); // 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거함. 만약 큐가 비어있으면 null을 반환함.
		}
		System.out.println(list); // poll때문에 비었음
		
//		while(list.peek() != null) { // list.element()
//			String msg =(String)list.poll(); // list.remove()
//			System.out.println(msg);			
//		}
		
	}
}
