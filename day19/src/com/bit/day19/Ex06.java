package com.bit.day19;

import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		// Queue  - ���Լ���
		
		java.util.Queue list = new LinkedList(); // Queue�� ����� �͵鸸 LinkedList���� �� �� ����
		list.offer("ù��°"); // list.add()
		list.offer("�ι�°");
		list.offer("����°");
		list.offer("�׹�°");
		
		for(int i=0; i<4; i++) {
			String msg = (String)list.peek(); // peek() - �ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ��. ���� ť�� ��������� null�� ��ȯ��.
			System.out.println(msg);
			System.out.println(list.poll()); // �ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ�ϰ�, �ش� ��Ҹ� ť���� ������. ���� ť�� ��������� null�� ��ȯ��.
		}
		System.out.println(list); // poll������ �����
		
//		while(list.peek() != null) { // list.element()
//			String msg =(String)list.poll(); // list.remove()
//			System.out.println(msg);			
//		}
		
	}
}
