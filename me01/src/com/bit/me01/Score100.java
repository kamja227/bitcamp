package com.bit.me01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Score100 {
	
	public static void main(String[] args) {
		java.util.Map map = new java.util.TreeMap();
		java.util.Map map2 = new java.util.TreeMap();
		ArrayList data = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л������������α׷�(ver 0.2.0)");
		String input = null; // �� ����

		while(true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >>");
			input = sc.nextLine();
			
			if(input.equals("0")) { break; }
			
			else if(input.equals("2")) {
				//�Է�
				
				System.out.print("�й�>");
				int num = Integer.parseInt(sc.nextLine());
				map.put("�й�", num);
				System.out.print("�̸�>");
				String name = sc.nextLine();
				map.put("�̸�", name);
				System.out.print("����>");
				int kor = Integer.parseInt(sc.nextLine());
				map.put("����", kor);
				System.out.print("����>");
				int eng = Integer.parseInt(sc.nextLine());
				map.put("����", eng);
				System.out.print("����");
				int math = Integer.parseInt(sc.nextLine());
				
				map2.put(num, map);
				System.out.println(map2);
				
				
			}

			else if(input.equals("1")) {
				//����
//				Set keys = map2.keySet(); // ��� Ű ��ȯ
//				Iterator ite = keys.iterator(); 

//				while(ite.hasNext()) {
//					String key = (String)ite.next();
//					System.out.println(key + "\t" + map2.get(key));
//				}
				Iterator<Integer> keys = map2.keySet().iterator();

				while (keys.hasNext()) {

				    Integer key = keys.next();

				    System.out.println(map2.get(key));

				}
			}
			
			else if(input.equals("4")) {
			}
		}

	}
}





















