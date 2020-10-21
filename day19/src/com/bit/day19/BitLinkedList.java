package com.bit.day19;

// 장점: 입력 수정 삭제 할때마다 node의 주소만 생성
// 처리가 우선
// read 단점
// start 부터 시작해서 끝까지 타고 가야해서 마지막 주소 읽기 어려움

public class BitLinkedList {
	private Node start;
	private int cnt;
	
	class Node {
		Node next; //자신 타입
		Object val;
	}
	
	public void add(Object val) {
		cnt++;
		Node node = new Node();
		node.val = val;
		
//		start = node;
//		start.next = node;
//		start.next.next = node;
//		start.next.next.next = node;
//		start.next.next.next = node;
		if(cnt == 1) {
			node.val = val;
		} else {
			Node temp = start;
			while(true) {
				if(temp.next == null) {break;}
				temp = temp.next;
			}
			temp.next = node;
		} 
	}
		
	public Object size() {
		return cnt;
	}
		
	public Object get(int idx) {
//		0.start.val
//		1.start.next.val
//		2.start.next.next.val
		Node temp = start;
		for(int i=0; i<idx ; i++) {
			temp = temp.next;
		}
		return temp.val;
	
		
	} // get end
} // BitLinkList end