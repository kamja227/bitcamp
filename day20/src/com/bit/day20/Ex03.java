package com.bit.day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex03 {
	// Set
	public static void main(String[] args) {
//		java.util.TreeSet set01 = new TreeSet(); // ���� ����
		java.util.HashSet set01 = new HashSet();
		
		set01.add("ù��°");
		set01.add("�ι�°");
		set01.add("����°");
		set01.add("�׹�°"); // �ε�����ȣ�� ���� but SetŸ���� ������ ����
//		set01.add("�ι�°"); // �ߺ� �ȵ�
		set01.add("�ټ���°");
		
		System.out.println(set01.size());
		
		// 1�� ��� - ����
		java.util.Iterator ite = set01.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("---------------------------");
		
		// 2�� ���
		Iterator ite2 = set01.iterator();
		for(int i=0; i<set01.size(); i++) {
			System.out.println(ite2.next()); // ite�� ȣ���ϸ� �̹� ������ exception�߻�
		}
		
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());

		
	
	}
}
