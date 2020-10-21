package com.bit.day19;

public class Ex07 {

	public static void main(String[] args) {
		java.util.Deque deq = new java.util.LinkedList();
		
		// queue (first in first out)
		deq.offerFirst("1��°");
		deq.offerFirst("2��°");
		deq.offerFirst("3��°");
		deq.offerFirst("4��°");
		deq.offerFirst("5��°");
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
		deq.offerLast("1��°");
		deq.offerLast("2��°");
		deq.offerLast("3��°");
		deq.offerLast("4��°");
		deq.offerLast("5��°");
		
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
