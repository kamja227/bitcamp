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
		
		System.out.println("학생성적관리프로그램(ver 0.2.0)");
		String input = null; // 값 받음

		while(true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >>");
			input = sc.nextLine();
			
			if(input.equals("0")) { break; }
			
			else if(input.equals("2")) {
				//입력
				
				System.out.print("학번>");
				int num = Integer.parseInt(sc.nextLine());
				map.put("학번", num);
				System.out.print("이름>");
				String name = sc.nextLine();
				map.put("이름", name);
				System.out.print("국어>");
				int kor = Integer.parseInt(sc.nextLine());
				map.put("국어", kor);
				System.out.print("영어>");
				int eng = Integer.parseInt(sc.nextLine());
				map.put("영어", eng);
				System.out.print("수학");
				int math = Integer.parseInt(sc.nextLine());
				
				map2.put(num, map);
				System.out.println(map2);
				
				
			}

			else if(input.equals("1")) {
				//보기
//				Set keys = map2.keySet(); // 모든 키 반환
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





















