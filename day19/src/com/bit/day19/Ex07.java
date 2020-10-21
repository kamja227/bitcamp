package com.bit.day19;

public class Ex07 {

	public static void main(String[] args) {
		java.util.Deque deq = new java.util.LinkedList();
		
		// queue (first in first out)
		deq.offerFirst("1번째");
		deq.offerFirst("2번째");
		deq.offerFirst("3번째");
		deq.offerFirst("4번째");
		deq.offerFirst("5번째");
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println("----------------------------------------------");
		
		// stack(front in last out)
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		deq.offerLast("1번째");
		deq.offerLast("2번째");
		deq.offerLast("3번째");
		deq.offerLast("4번째");
		deq.offerLast("5번째");
		
		// queue (first in first out)
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println("----------------------------------------------");

		// stack (first in last out)
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
	}
}
