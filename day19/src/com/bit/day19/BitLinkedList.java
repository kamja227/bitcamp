package com.bit.day19;

// ����: �Է� ���� ���� �Ҷ����� node�� �ּҸ� ����
// ó���� �켱
// read ����
// start ���� �����ؼ� ������ Ÿ�� �����ؼ� ������ �ּ� �б� �����

public class BitLinkedList {
	private Node start;
	private int cnt;
	
	class Node {
		Node next; //�ڽ� Ÿ��
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