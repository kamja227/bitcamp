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
		java.util.Set set1 = new java.util.HashSet(); // ��������
//		java.util.Set set1 = new java.util.TreeSet(); // ������� // ������ ���� �ö󰡼� �ڵ����� ��Ģ ����(�����϶���) //�����ڵ�� ũ���
														// ��ü�� ȣ���� ���� ����
//		set1.add("a");
//		set1.add("ab");
//		set1.add("accd");
//		set1.add("abcde");

		set1.add(new MyCar(1)); //TreeSet ����
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
